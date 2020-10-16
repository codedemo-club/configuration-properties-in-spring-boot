package club.codedemo.configurationpropertiesinspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * 不可变(只读)配置
 *
 * 使用@Configuration注解时，Spring Boot将按构造函数的参数类型进行自动注入
 * 而此类的构造函数并不适用于自动注入，所以不能够在此类上使用@Configuration注解
 * 使其生效，应该在启动类上加入@EnableConfigurationProperties注解
 */
@ConfigurationProperties(prefix = "sms.credentials")
@ConstructorBinding
public class ImmutableCredentialsProperties {
    private String id;
    /**
     * 密钥
     */
    private String secret;
    /**
     * 认证令牌
     */
    private String token;

    public ImmutableCredentialsProperties(String id, String secret, String token) {
        this.id = id;
        this.secret = secret;
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public String getSecret() {
        return secret;
    }

    public String getToken() {
        return token;
    }
}
