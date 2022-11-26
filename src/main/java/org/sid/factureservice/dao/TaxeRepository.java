package org.sid.factureservice.dao;

import org.sid.factureservice.entities.Client;
import org.sid.factureservice.entities.Taxe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaxeRepository extends MongoRepository<Taxe,String> {

}
