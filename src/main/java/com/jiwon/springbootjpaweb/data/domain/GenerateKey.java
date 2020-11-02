package com.jiwon.springbootjpaweb.data.domain;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static com.jiwon.springbootjpaweb.data.domain.GenerateKey.GenerateType.UUID;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * String.class탕
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface GenerateKey {

    GenerateType value() default UUID;

    enum GenerateType {
        UUID {
            @Override
            public String generate() {
                return java.util.UUID.randomUUID().toString();
            }
        };

        public abstract String generate();
    }
}
