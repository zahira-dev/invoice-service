package org.sid.factureservice.dao;

import org.sid.factureservice.entities.Discount;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiscountRepository extends MongoRepository<Discount,String> {
}
