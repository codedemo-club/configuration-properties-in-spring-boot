package club.codedemo.configurationpropertiesinspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.unit.DataSize;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConversionPropertiesTest {
    @Autowired
    ConversionProperties conversionProperties;

    @Test
    void getTimeInDefaultUnit() {
        assertEquals(30, this.conversionProperties.getTimeInDefaultUnit().toMillis());
    }

    @Test
    void getTimeInNano() {
        assertEquals(50, this.conversionProperties.getTimeInNano().toNanos());
    }

    @Test
    void getTimeInDays() {
        assertEquals(10, this.conversionProperties.getTimeInDays().toDays());
    }

    @Test
    void getSizeInDefaultUnit() {
        assertEquals(30, this.conversionProperties.getSizeInDefaultUnit().toBytes());
    }

    @Test
    void getSizeInGB() {
        assertEquals(50, this.conversionProperties.getSizeInGB().toGigabytes());
    }

    @Test
    void getSizeInTB() {
        assertEquals(10, this.conversionProperties.getSizeInTB().toTerabytes());
    }

    @Test
    void getEmployee() {
        assertEquals("john", this.conversionProperties.getEmployee().getName());
        assertEquals(2000, this.conversionProperties.getEmployee().getSalary());
    }
}