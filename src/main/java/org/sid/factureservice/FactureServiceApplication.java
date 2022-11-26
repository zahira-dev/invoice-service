package org.sid.factureservice;

import org.sid.factureservice.dao.ClientRepository;
import org.sid.factureservice.dao.FactureRepository;
import org.sid.factureservice.dao.ProfileRepository;
import org.sid.factureservice.entities.Client;
import org.sid.factureservice.entities.Facture;
import org.sid.factureservice.entities.Profile;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.stream.Stream;

@SpringBootApplication
public class FactureServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactureServiceApplication.class, args);
    }
     @Bean
    CommandLineRunner start(FactureRepository factureRepository, ProfileRepository profileRepository, ClientRepository clientRepository){
        return  args -> {
            clientRepository.deleteAll();

            Stream.of("1","2","3").forEach(d->{
               Client c=clientRepository.save(new Client(d,new ArrayList<>()));

            });
            clientRepository.findAll().forEach(System.out::println);
            profileRepository.deleteAll();

            Stream.of("1","2","3").forEach(p->{
                profileRepository.save(new Profile(p,new ArrayList<>()));

            });

            profileRepository.findAll().forEach(System.out::println);
             factureRepository.deleteAll();
             Profile p1=profileRepository.findById("1").get();
            Client c1=clientRepository.findById("1").get();
            Stream.of("invoice1","invoice2","invoice3").forEach(c->{
                factureRepository.save(new Facture(c,c1,p1, new ArrayList<>()));


            });
            factureRepository.findAll().forEach(System.out::println);





        };
     }
}
