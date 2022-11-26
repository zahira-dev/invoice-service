package org.sid.factureservice.dao;

import org.sid.factureservice.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client,String> {

}
