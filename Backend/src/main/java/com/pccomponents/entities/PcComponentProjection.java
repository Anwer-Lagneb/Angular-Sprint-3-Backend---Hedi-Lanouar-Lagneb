package com.pccomponents.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomComponent", types = PcComponent.class)
public interface PcComponentProjection {
    String getNomComponent();
}
