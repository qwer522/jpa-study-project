package springbootjpaweb.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import springbootjpaweb.data.domain.AbstractAuditable;
import springbootjpaweb.data.domain.GenerateKey;
import springbootjpaweb.domain.Role;
import springbootjpaweb.domain.order.Order;
import springbootjpaweb.domain.shippingaddress.ShippingAddress;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Audited    // 이 어노테이션이 테이블을 생성
@Table(name = "tn_member")
@NoArgsConstructor
@AllArgsConstructor
public class Member extends AbstractAuditable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GenerateKey
    @Column(name = "key")
    private String key;

    @Column(name = "password")
    private String password;

    @Column(name = "name", length = 200)
    private String name;

    @Lob
    @Column(name = "email")
    private String email;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "address3")
    private String address3;

    @Column(name = "phone")
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Column(name = "lastLoginDate")
    private LocalDateTime lastLoginDate;

    @NotAudited
    @OneToMany(mappedBy = "member")
    private final List<ShippingAddress> shippingAddresses = new ArrayList<>();

    @NotAudited
    @OneToMany(mappedBy = "member")
    private final List<Order> order = new ArrayList<>();

    @Builder
    public Member (Long id,String email, String password, String name, String address1, String address2, String address3, String phone, Role role, LocalDateTime lastLoginDate){
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.phone = phone;
        this.role = role;
        this.lastLoginDate = lastLoginDate;
    }

    public void lastLoginDateNovation(){
        this.lastLoginDate = LocalDateTime.now();
    }
}
