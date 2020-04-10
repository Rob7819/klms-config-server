package com.github.klbeerops.klmsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class KlmsConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlmsConfigServerApplication.class, args);
    }

}
