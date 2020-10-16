package club.codedemo.configurationpropertiesinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FooConfigProperties.class, ImmutableCredentialsProperties.class})
@ConfigurationPropertiesScan("club.codedemo.configurationpropertiesinspringboot.scan")
public class ConfigurationPropertiesInSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationPropertiesInSpringBootApplication.class, args);
	}

}
