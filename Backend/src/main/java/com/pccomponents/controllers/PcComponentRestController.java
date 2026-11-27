package com.pccomponents.controllers;

import com.pccomponents.entities.PcComponent;
import com.pccomponents.services.PcComponentService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PcComponentRestController {
    private final PcComponentService service;

    public PcComponentRestController(PcComponentService service) { this.service = service; }

    @GetMapping
    public List<PcComponent> getAllComponents() { return service.getAllComponents(); }

    @GetMapping("/{id}")
    public PcComponent getComponentById(@PathVariable Long id) { return service.getComponent(id); }

    @PostMapping
    public PcComponent createComponent(@RequestBody PcComponent component) {
        return service.saveComponent(component);
    }

    @PutMapping
    public PcComponent updateComponent(@RequestBody PcComponent component) {
        return service.updateComponent(component);
    }

    @DeleteMapping("/{id}")
    public void deleteComponent(@PathVariable Long id) { service.deleteComponentById(id); }

    @GetMapping("/prodscat/{idCat}")
    public List<PcComponent> getComponentsByCategory(@PathVariable Long idCat) {
        return service.findByCategorieIdCat(idCat);
    }
}
