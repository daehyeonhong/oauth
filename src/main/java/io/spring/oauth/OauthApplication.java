package io.spring.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OauthApplication {
    public static void main(final String[] args) {
        SpringApplication.run(OauthApplication.class, args);
    }
}
