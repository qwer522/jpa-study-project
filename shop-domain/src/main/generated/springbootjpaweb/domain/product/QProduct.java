package springbootjpaweb.domain.product;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = 266171260L;

    public static final QProduct product = new QProduct("product");

    public final StringPath category = createString("category");

    public final ListPath<springbootjpaweb.domain.category.CategoryProduct, springbootjpaweb.domain.category.QCategoryProduct> categoryProducts = this.<springbootjpaweb.domain.category.CategoryProduct, springbootjpaweb.domain.category.QCategoryProduct>createList("categoryProducts", springbootjpaweb.domain.category.CategoryProduct.class, springbootjpaweb.domain.category.QCategoryProduct.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgPath = createString("imgPath");

    public final ListPath<springbootjpaweb.domain.order.OrderProduct, springbootjpaweb.domain.order.QOrderProduct> orderProducts = this.<springbootjpaweb.domain.order.OrderProduct, springbootjpaweb.domain.order.QOrderProduct>createList("orderProducts", springbootjpaweb.domain.order.OrderProduct.class, springbootjpaweb.domain.order.QOrderProduct.class, PathInits.DIRECT2);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    public final StringPath title = createString("title");

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

