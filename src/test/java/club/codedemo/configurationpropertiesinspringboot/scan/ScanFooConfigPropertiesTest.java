package club.codedemo.configurationpropertiesinspringboot.scan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScanFooConfigPropertiesTest {
    @Autowired
    ScanFooConfigProperties scanFooConfigProperties;

    @Test
    void getBar() {
        assertTrue(this.scanFooConfigProperties.getBar().equals("scanFooBar"));
    }
}