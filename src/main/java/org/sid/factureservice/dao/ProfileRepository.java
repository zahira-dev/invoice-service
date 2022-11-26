package org.sid.factureservice.dao;

import org.sid.factureservice.entities.Client;
import org.sid.factureservice.entities.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile,String> {

}
