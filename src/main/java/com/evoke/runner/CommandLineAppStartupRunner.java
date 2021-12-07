package com.evoke.runner;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);

    @Value("${server.email}")
    private String mail;
    
    @Override
    public void run(String...args) throws Exception {
        logger.info("MAIL AVILABLE  ::::  {}",mail);
        logger.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", Arrays.toString(args));
        
        logger.debug("MAIL AVILABLE  ::::  {}",mail);
    }
}