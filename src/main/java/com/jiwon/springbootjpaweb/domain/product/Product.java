package com.jiwon.springbootjpaweb.domain.product;

import com.jiwon.springbootjpaweb.domain.category.CategoryProduct;
import com.jiwon.springbootjpaweb.domain.order.OrderProduct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@Audited
@Table(name = "tn_product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "img_path")
    private String imgPath;

    @Column(name = "category")
    private String category;

    @Column(name = "stock")
    private int stock;

    @NotAudited
    @OneToMany(mappedBy = "product")
    private List<CategoryProduct> categoryProducts = new ArrayList<>();

    @NotAudited
    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProducts = new ArrayList<>();

}
