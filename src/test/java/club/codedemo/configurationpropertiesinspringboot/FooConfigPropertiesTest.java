package club.codedemo.configurationpropertiesinspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FooConfigPropertiesTest {
    @Autowired
    FooConfigProperties fooConfigProperties;
    @Test
    void getBar() {
        assertTrue(this.fooConfigProperties.getBar().equals("bar"));
    }
}