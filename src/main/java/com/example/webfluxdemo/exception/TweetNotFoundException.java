package com.example.webfluxdemo.exception;

/**
 * Created by ravi kumar on 22/10/18.
 */
public class TweetNotFoundException extends RuntimeException {

    public TweetNotFoundException(String tweetId) {
        super("Tweet not found with id " + tweetId);
    }
}
