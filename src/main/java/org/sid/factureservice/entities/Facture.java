package org.sid.factureservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Facture {
    @Id
    private String id;
    @DBRef
    private  Client client;
    @DBRef
    private  Profile profile;
    private Collection<Livrable> livrables=new ArrayList<>();
}
