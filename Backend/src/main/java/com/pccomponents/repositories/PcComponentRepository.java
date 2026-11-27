package com.pccomponents.repositories;

import com.pccomponents.entities.PcComponent;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "rest", collectionResourceRel = "pcComponents")
@CrossOrigin(origins = "http://localhost:4200")
public interface PcComponentRepository extends JpaRepository<PcComponent, Long> {
    List<PcComponent> findByNomComponentContains(String nom);
    List<PcComponent> findByCategorieIdCat(Long id);
    List<PcComponent> findByOrderByNomComponentAsc();
}
