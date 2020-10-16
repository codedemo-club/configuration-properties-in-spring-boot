package club.codedemo.configurationpropertiesinspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConfigPropertiesTest {
    @Autowired
    BeanMethod beanMethod;

    @Test
    void getFoo() {
        assertEquals("beanMethodBar", this.beanMethod.getFoo());
    }
}