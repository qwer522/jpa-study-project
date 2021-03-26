package springbootjpaweb.service;

import org.springframework.stereotype.Service;
import springbootjpaweb.domain.product.Product;
import springbootjpaweb.repository.ProductRepository;
import springbootjpaweb.representative.ProductResponse;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> read(){
        return productRepository.findAll();
    }

    public ProductResponse getProduct(Long id){
        Optional<Product> product = productRepository.findById(id);

        return ProductResponse.builder()
                .id(product.get().getId())
                .category(product.get().getCategory())
                .imgPath(product.get().getImgPath())
                .title(product.get().getTitle())
                .price(product.get().getPrice())
                .stock(product.get().getStock())
                .build();
    }
}
