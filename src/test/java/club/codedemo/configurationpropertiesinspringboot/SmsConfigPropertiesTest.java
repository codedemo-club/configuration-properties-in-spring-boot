package club.codedemo.configurationpropertiesinspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SmsConfigPropertiesTest {
    @Autowired
    SmsConfigProperties smsConfigProperties;

    @Test
    void getUrl() {
        assertEquals("sms.codedemo.club", this.smsConfigProperties.getApiUrl());
    }

    @Test
    void getId() {
        assertEquals(8088, this.smsConfigProperties.getPort());
    }
}