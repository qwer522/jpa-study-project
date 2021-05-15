package springbootjpaweb.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 2091457594L;

    public static final QMember member = new QMember("member1");

    public final springbootjpaweb.data.domain.QAbstractAuditable _super = new springbootjpaweb.data.domain.QAbstractAuditable(this);

    public final StringPath address1 = createString("address1");

    public final StringPath address2 = createString("address2");

    public final StringPath address3 = createString("address3");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath key = createString("key");

    public final DateTimePath<java.time.LocalDateTime> lastLoginDate = createDateTime("lastLoginDate", java.time.LocalDateTime.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    //inherited
    public final SimplePath<java.util.Optional<java.util.Calendar>> lastModifiedDateForCalendar = _super.lastModifiedDateForCalendar;

    public final StringPath name = createString("name");

    public final ListPath<springbootjpaweb.domain.order.Order, springbootjpaweb.domain.order.QOrder> order = this.<springbootjpaweb.domain.order.Order, springbootjpaweb.domain.order.QOrder>createList("order", springbootjpaweb.domain.order.Order.class, springbootjpaweb.domain.order.QOrder.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final EnumPath<springbootjpaweb.domain.Role> role = createEnum("role", springbootjpaweb.domain.Role.class);

    public final ListPath<springbootjpaweb.domain.shippingaddress.ShippingAddress, springbootjpaweb.domain.shippingaddress.QShippingAddress> shippingAddresses = this.<springbootjpaweb.domain.shippingaddress.ShippingAddress, springbootjpaweb.domain.shippingaddress.QShippingAddress>createList("shippingAddresses", springbootjpaweb.domain.shippingaddress.ShippingAddress.class, springbootjpaweb.domain.shippingaddress.QShippingAddress.class, PathInits.DIRECT2);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

