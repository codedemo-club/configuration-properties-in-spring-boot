package club.codedemo.configurationpropertiesinspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ImmutableCredentialsPropertiesTest {

    @Autowired
    ImmutableCredentialsProperties immutableCredentialsProperties;

    @Test
    void getId() {
        assertEquals("yourId", this.immutableCredentialsProperties.getId());
    }

    @Test
    void getSecret() {
        assertEquals("yourSecret", this.immutableCredentialsProperties.getSecret());
    }

    @Test
    void getToken() {
        assertEquals("yourToken", this.immutableCredentialsProperties.getToken());
    }
}