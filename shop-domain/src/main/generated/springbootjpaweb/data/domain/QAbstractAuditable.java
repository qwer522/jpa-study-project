package springbootjpaweb.data.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractAuditable is a Querydsl query type for AbstractAuditable
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAbstractAuditable extends EntityPathBase<AbstractAuditable<? extends java.io.Serializable>> {

    private static final long serialVersionUID = 1840154135L;

    public static final QAbstractAuditable abstractAuditable = new QAbstractAuditable("abstractAuditable");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = createDateTime("lastModifiedDate", java.time.LocalDateTime.class);

    public final SimplePath<java.util.Optional<java.util.Calendar>> lastModifiedDateForCalendar = createSimple("lastModifiedDateForCalendar", java.util.Optional.class);

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractAuditable(String variable) {
        super((Class) AbstractAuditable.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractAuditable(Path<? extends AbstractAuditable> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractAuditable(PathMetadata metadata) {
        super((Class) AbstractAuditable.class, metadata);
    }

}

