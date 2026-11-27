package com.pccomponents;

import com.pccomponents.entities.Categorie;
import com.pccomponents.entities.PcComponent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class PcComponentsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PcComponentsApplication.class, args);
    }

    @Bean
    CommandLineRunner exposeEntityIds(RepositoryRestConfiguration configuration) {
        return args -> configuration.exposeIdsFor(PcComponent.class, Categorie.class);
    }
}
