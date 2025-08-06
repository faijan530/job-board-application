//package com.jasiqlabs;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//    @SpringBootApplication
//    public class JobboardApplication {
//        public static void main(String[] args) {
//            SpringApplication.run(JobboardApplication.class, args);
//
//        }
//    }

package com.jasiqlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jasiqlabs")  // ✅ very important
public class JobboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobboardApplication.class, args);
    }
}
