package com.fahai;

/**
 * Created by zhanghao on 16/4/18.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;



@SpringBootApplication
public class SampleJettyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleJettyApplication.class, args);
    }
}
