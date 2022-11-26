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

@Data @AllArgsConstructor @ToString @NoArgsConstructor
@Document
public class Profile {
    @Id
    private String id;
    @DBRef
    private Collection<Facture> factures=new ArrayList<>();
}
