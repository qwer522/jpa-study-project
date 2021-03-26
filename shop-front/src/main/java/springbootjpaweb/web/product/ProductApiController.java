package springbootjpaweb.web.product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springbootjpaweb.domain.product.Product;
import springbootjpaweb.representative.MemberRequest;
import springbootjpaweb.representative.ProductResponse;
import springbootjpaweb.service.ProductService;
import springbootjpaweb.util.ApiResponse;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductApiController {

    private final ProductService productService;

    @GetMapping("")
    @CrossOrigin(origins ="http://localhost:8081" )
    public ApiResponse<List<Product>> loginJoin() {
        return ApiResponse.ok(productService.read());
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins ="http://localhost:8081" )
    public ApiResponse<ProductResponse> getProduct(@PathVariable Long id){
        ProductResponse productResponse = productService.getProduct(id);
        return ApiResponse.ok(productResponse);
    }

}
