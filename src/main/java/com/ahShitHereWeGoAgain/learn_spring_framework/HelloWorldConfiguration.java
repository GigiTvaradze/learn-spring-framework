package com.ahShitHereWeGoAgain.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Hello World";
    }

    @Bean
    public int age(){
        return 26;
    }

    @Bean
    public Person person(){
        return new Person("John Doe", 28);
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("Pekini Ave.","Tbilisi");
    }

    //with name and age beans make person2 bean
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age());
    }

    @Bean
    public Person person3Parameters(String name, int age){
        return new Person(name,age);
    }
}