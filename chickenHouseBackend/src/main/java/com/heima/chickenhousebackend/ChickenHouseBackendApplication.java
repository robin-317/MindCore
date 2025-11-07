package com.heima.chickenhousebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@ServletComponentScan //开启SpringBoot对Servlet组件的支持
@EnableCaching
public class ChickenHouseBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChickenHouseBackendApplication.class, args);
    }

}
