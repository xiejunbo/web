package com.xiejunbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApplicationService extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
    private static Logger logger = LoggerFactory.getLogger(ApplicationService.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationService.class);
        logger.info("==========================================================");
        logger.info("[************* Application started *************]");
        logger.info("==========================================================");
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(10030);
    }

}

