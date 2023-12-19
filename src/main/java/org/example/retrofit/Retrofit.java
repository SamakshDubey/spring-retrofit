package org.example.retrofit;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(RetrofitBeanRegistrar.class)
public @interface Retrofit {
    String[] value();
}