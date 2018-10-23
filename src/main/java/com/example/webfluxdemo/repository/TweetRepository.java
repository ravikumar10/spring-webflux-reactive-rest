package com.example.webfluxdemo.repository;

import com.example.webfluxdemo.model.Tweet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ravi kumar on 08/09/18.
 */
@Repository
public interface TweetRepository extends ReactiveMongoRepository<Tweet, String> {

}
