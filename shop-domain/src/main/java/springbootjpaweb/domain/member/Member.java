package springbootjpaweb.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import springbootjpaweb.data.domain.AbstractAuditable;
import springbootjpaweb.data.domain.GenerateKey;
import springbootjpaweb.domain.Role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.time.LocalDateTime;

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

//    @Column(name = "created_by")
//    private String createBy;
//
//    @Column(name = "created_date")
//    private LocalDateTime createDate;
//
//    @Column(name = "last_modified_by")
//    private String lastModifiedBy;
//
//    @Column(name = "last_modified_date")
//    private LocalDateTime lastModifiedDate;

    @Builder
    public Member (String email, String password, String name, String address1, String address2, String address3, String phone, Role role, LocalDateTime lastLoginDate){
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
