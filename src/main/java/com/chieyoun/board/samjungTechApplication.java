package com.chieyoun.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class samjungTechApplication {
    public static void main(String[] args) {
        SpringApplication.run(samjungTechApplication.class, args);
        System.out.println("실행 완료");
    }
}
