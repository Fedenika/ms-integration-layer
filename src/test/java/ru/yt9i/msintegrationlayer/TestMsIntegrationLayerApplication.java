package ru.yt9i.msintegrationlayer;

import org.springframework.boot.SpringApplication;

public class TestMsIntegrationLayerApplication {

    public static void main(String[] args) {
        SpringApplication.from(MsIntegrationLayerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
