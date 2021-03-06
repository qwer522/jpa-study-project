package springbootjpaweb.representative;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import springbootjpaweb.domain.member.Member;
import springbootjpaweb.domain.product.Product;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartResponse {
    Long id;
    Long member_id;
    Long product_id;
    Member member;
    Product product;
    int count;
}
