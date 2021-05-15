package springbootjpaweb.domain.cart;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springbootjpaweb.domain.member.Member;
import springbootjpaweb.domain.product.Product;

import javax.persistence.*;

@Entity
@Getter
@Builder
@Table(name = "tn_cart")
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long member_id;

    @Column(name = "product_id")
    private Long product_id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;

    @Column(name = "count")
    private int count;
}
