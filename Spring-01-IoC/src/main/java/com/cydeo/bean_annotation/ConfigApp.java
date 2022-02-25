package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeMentor() {
        return new FullTimeMentor();
    }

    // if we write same method twice and call with getBean then
    // we can get this err: No qualifying bean of type 'com.cydeo.bean_annotation.PartTimeMentor' available:
    // expected single matching bean but found 2: partTimeMentor,partTimeMentor2
//    @Bean
//    PartTimeMentor partTimeMentor() {
//        return new PartTimeMentor();
//    }
//    @Bean
//    PartTimeMentor partTimeMentor2() {
//        return new PartTimeMentor();
//    }
    // to handle this we can give names to the Beans:
//    @Bean(name = "p1")
    @Bean
    @Primary
    PartTimeMentor partTimeMentor() {
        return new PartTimeMentor();
    }

//    @Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentor2() {
        return new PartTimeMentor();
    }



}
