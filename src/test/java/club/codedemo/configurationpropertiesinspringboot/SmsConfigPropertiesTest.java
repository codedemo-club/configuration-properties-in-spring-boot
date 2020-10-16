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

    @Test
    void getSigns() {
        assertEquals(2, this.smsConfigProperties.getSigns().size());
        assertEquals("codedemo", this.smsConfigProperties.getSigns().get(0));
        assertEquals("yunzhi", this.smsConfigProperties.getSigns().get(1));
    }

    @Test
    void getAdditionalHeaders() {
        assertEquals("true", this.smsConfigProperties.getAdditionalHeaders().get("secure"));
        assertEquals("panjie", this.smsConfigProperties.getAdditionalHeaders().get("senduser"));
    }

    @Test
    void getCredentials() {
        assertEquals("yourId", this.smsConfigProperties.getCredentials().getId());
        assertEquals("yourSecret", this.smsConfigProperties.getCredentials().getSecret());
        assertEquals("yourToken", this.smsConfigProperties.getCredentials().getToken());
    }
}