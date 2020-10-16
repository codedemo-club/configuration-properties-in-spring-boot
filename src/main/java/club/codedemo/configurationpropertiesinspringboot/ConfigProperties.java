package club.codedemo.configurationpropertiesinspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {
    @Bean
    @ConfigurationProperties(prefix = "bean.method")
    public BeanMethod beanMethodFoo() {
        return new BeanMethod();
    }

    public static class BeanMethod {
        private String foo;

        public String getFoo() {
            return foo;
        }

        public void setFoo(String foo) {
            this.foo = foo;
        }
    }
}


