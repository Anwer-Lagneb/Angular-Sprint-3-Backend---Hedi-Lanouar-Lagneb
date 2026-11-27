package com.pccomponents.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class PcComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComponent;
    private String nomComponent;
    private Double prixComponent;
    private Date dateCreation;

    @ManyToOne
    private Categorie categorie;

    public PcComponent() {}
    public PcComponent(String nomComponent, Double prixComponent, Date dateCreation, Categorie categorie) {
        this.nomComponent = nomComponent;
        this.prixComponent = prixComponent;
        this.dateCreation = dateCreation;
        this.categorie = categorie;
    }
    public Long getIdComponent() { return idComponent; }
    public void setIdComponent(Long idComponent) { this.idComponent = idComponent; }
    public String getNomComponent() { return nomComponent; }
    public void setNomComponent(String nomComponent) { this.nomComponent = nomComponent; }
    public Double getPrixComponent() { return prixComponent; }
    public void setPrixComponent(Double prixComponent) { this.prixComponent = prixComponent; }
    public Date getDateCreation() { return dateCreation; }
    public void setDateCreation(Date dateCreation) { this.dateCreation = dateCreation; }
    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}
