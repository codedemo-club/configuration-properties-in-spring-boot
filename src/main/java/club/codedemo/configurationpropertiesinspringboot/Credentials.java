package club.codedemo.configurationpropertiesinspringboot;

/**
 * 认证信息
 */
public class Credentials {
    private String id;
    /**
     * 密钥
     */
    private String secret;
    /**
     * 认证令牌
     */
    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
