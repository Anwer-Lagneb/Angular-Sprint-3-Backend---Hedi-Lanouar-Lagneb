package com.pccomponents.services;

import com.pccomponents.entities.PcComponent;
import com.pccomponents.repositories.PcComponentRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcComponentServiceImpl implements PcComponentService {
    private final PcComponentRepository repository;

    public PcComponentServiceImpl(PcComponentRepository repository) {
        this.repository = repository;
    }

    @Override
    public PcComponent saveComponent(PcComponent component) { return repository.save(component); }

    @Override
    public PcComponent updateComponent(PcComponent component) { return repository.save(component); }

    @Override
    public void deleteComponentById(Long id) { repository.deleteById(id); }

    @Override
    public PcComponent getComponent(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public List<PcComponent> getAllComponents() { return repository.findAll(); }

    @Override
    public List<PcComponent> findByCategorieIdCat(Long idCat) {
        return repository.findByCategorieIdCat(idCat);
    }
}
