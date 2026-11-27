package com.pccomponents.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String nomCat;
    private String descriptionCat;

    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private List<PcComponent> composants = new ArrayList<>();

    public Categorie() {}
    public Categorie(String nomCat, String descriptionCat) {
        this.nomCat = nomCat;
        this.descriptionCat = descriptionCat;
    }
    public Long getIdCat() { return idCat; }
    public void setIdCat(Long idCat) { this.idCat = idCat; }
    public String getNomCat() { return nomCat; }
    public void setNomCat(String nomCat) { this.nomCat = nomCat; }
    public String getDescriptionCat() { return descriptionCat; }
    public void setDescriptionCat(String descriptionCat) { this.descriptionCat = descriptionCat; }
    public List<PcComponent> getComposants() { return composants; }
    public void setComposants(List<PcComponent> composants) { this.composants = composants; }
}
