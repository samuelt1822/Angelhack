package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * This extends the User class with Mongo interface provided by spring data.
 * Makes all of the CRUD operations in Mongo available to you.
 */

public interface userRepository extends MongoRepository<User, String> {

}
