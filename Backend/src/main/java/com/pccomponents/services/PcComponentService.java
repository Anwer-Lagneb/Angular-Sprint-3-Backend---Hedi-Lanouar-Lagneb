package com.pccomponents.services;

import com.pccomponents.entities.PcComponent;
import java.util.List;

public interface PcComponentService {
    PcComponent saveComponent(PcComponent component);
    PcComponent updateComponent(PcComponent component);
    void deleteComponentById(Long id);
    PcComponent getComponent(Long id);
    List<PcComponent> getAllComponents();
    List<PcComponent> findByCategorieIdCat(Long idCat);
}
