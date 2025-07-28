package com.goinmuls.sidehub.adapter.out.mongo.repository;

import com.goinmuls.sidehub.adapter.out.mongo.document.LatestChatMessageDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LatestChatMessageMongoRepository extends MongoRepository<LatestChatMessageDocument, String> {
}
