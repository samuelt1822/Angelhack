package com.example.demo.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.example.demo.MongoConfig.MongoConfig;
import com.example.demo.models.User;

public class test {

  public static void main(String[] args) {
    // For Annotation
    ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
    MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");


    System.out.println("Test 1...");
    User userA = new User("01", false, "TestName", 54,
        "TestReligion", "TestSexPref", 65,
        "TestGender", new Date());
    mongoOperation.save(userA, "tableA");

  }

}
