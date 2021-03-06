package wq.sell.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import wq.sell.dataobject.ProductCategory;
import wq.sell.dataobject.ProductInfo;
import wq.sell.datatransferobject.CartDTO;

import java.util.List;

public interface ProductService {
    ProductInfo findOne(String productId);
    /**查询所有在架商品*/
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
