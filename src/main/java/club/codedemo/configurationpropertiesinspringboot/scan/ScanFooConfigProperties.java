package club.codedemo.configurationpropertiesinspringboot.scan;

import org.springframework.boot.context.properties.ConfigurationProperties;

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
