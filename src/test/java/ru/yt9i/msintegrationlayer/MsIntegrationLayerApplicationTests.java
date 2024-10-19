package ru.yt9i.msintegrationlayer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MsIntegrationLayerApplicationTests {

    @Test
    void contextLoads() {
    }

}
