package club.codedemo.configurationpropertiesinspringboot.scan;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 此配置文件结合启动类上的@ConfigurationPropertiesScan注解，近而生效
 */
@ConfigurationProperties(prefix = "scan.foo")
public class ScanFooConfigProperties {
    private String bar;

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
