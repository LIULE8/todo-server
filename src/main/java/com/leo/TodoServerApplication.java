package com.leo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author LIULE9
 */
@SpringBootApplication(scanBasePackages = "com.leo")
@ServletComponentScan
public class TodoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoServerApplication.class, args);
    }
}
