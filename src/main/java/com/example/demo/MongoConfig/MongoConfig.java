package com.example.demo.MongoConfig;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

  /**
   * Spring MongoDB configuration file
   *
   */

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {

      MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("127.0.0.1"),
          "user");
      return mongoTemplate;

    }
}
