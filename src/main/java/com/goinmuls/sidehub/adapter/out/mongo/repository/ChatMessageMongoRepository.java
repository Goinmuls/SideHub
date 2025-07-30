package com.goinmuls.sidehub.adapter.out.mongo.repository;

import com.goinmuls.sidehub.adapter.out.mongo.document.ChatMessageDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessageMongoRepository extends MongoRepository<ChatMessageDocument, String> {
}
