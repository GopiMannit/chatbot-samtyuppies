package com.mannit.chatbot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mannit.chatbot.model.Smartycount;

public interface Smartycountrepo extends MongoRepository<Smartycount, String> {
	
}
