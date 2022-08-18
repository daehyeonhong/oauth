package io.spring.oauth.config.auth;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = PARAMETER)
@Retention(value = RUNTIME)
public @interface LoginUser {
}
