package org.sid.factureservice.dao;

import org.sid.factureservice.entities.Facture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FactureRepository  extends MongoRepository<Facture,String> {


}
