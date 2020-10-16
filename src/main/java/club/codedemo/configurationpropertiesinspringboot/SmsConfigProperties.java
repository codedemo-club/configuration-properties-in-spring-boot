package club.codedemo.configurationpropertiesinspringboot;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Map;

/**
 * 在部分Spring Boot版本（比如Spring Boot 2.2.0）中，可以省略 @Configuration
 * 但即使是这样，我们仍然推荐加入@Configuration注解以兼容不同Spring Boot版本
 */
@Configuration
@Validated
@ConfigurationProperties(prefix = "sms")
public class SmsConfigProperties {
    /**
     * 短信接口地址
     * 此字段不为空
     * 请修改配置文件中的sms.api-url的值为空来测试@NotBlank注解
     */
    @NotBlank
    private String apiUrl;

    /**
     * 请求方法
     * 长度介于3-8位之间
     */
    @Length(max = 8, min = 3)
    private String requestMethod;

    /**
     * 端口
     * 介于1-65535之间
     */
    @Min(1)
    @Max(65535)
    private int port;

    /**
     * 接收提醒消息的邮箱
     * 使用正则表达式校验邮箱格式
     */
    @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")
    private String email;

    /**
     * 签名
     */
    private List<String> signs;

    /**
     * 附加请求头
     */
    private Map<String, String> additionalHeaders;

    /**
     * 认证信息
     */
    private Credentials credentials;

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public List<String> getSigns() {
        return signs;
    }

    public void setSigns(List<String> signs) {
        this.signs = signs;
    }

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
