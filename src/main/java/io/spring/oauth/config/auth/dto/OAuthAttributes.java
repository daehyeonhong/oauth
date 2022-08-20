package io.spring.oauth.config.auth.dto;

import io.spring.oauth.user.domain.Role;
import io.spring.oauth.user.domain.User;
import lombok.Builder;
import java.util.Map;

public record OAuthAttributes(Map<String, Object> attributes, String nameAttributeKey, String name, String email,
                              String picture) {
    @Builder
    public OAuthAttributes {
    }

    public static OAuthAttributes of(final String registrationId,
                                     final String userNameAttributeName,
                                     final Map<String, Object> attributes) {
        return ofGoogle(userNameAttributeName, attributes);
    }

    private static OAuthAttributes ofGoogle(final String userNameAttributeName,
                                            final Map<String, Object> attributes) {
        return OAuthAttributes.builder()
                .name((String) attributes.get("name"))
                .email((String) attributes.get("email"))
                .picture((String) attributes.get("picture"))
                .attributes(attributes)
                .nameAttributeKey(userNameAttributeName)
                .build();
    }

    public User toEntity() {
        return User.builder()
                .name(name)
                .email(email)
                .picture(picture)
                .role(Role.GUEST)
                .build();
    }
}
