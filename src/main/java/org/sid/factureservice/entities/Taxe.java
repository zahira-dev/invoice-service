package org.sid.factureservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString
@Document
public class Taxe {
    private String id;

}
