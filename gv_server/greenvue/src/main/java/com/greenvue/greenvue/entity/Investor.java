package com.greenvue.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double cashDistributions;
    private double taxCredits;
    private double powerProduced;
    private double carbonAvoided;
    // Getters and setters

    public Long getId(){return id;}
    public void setId(Long id){
        this.id=id;
    }

    public String getName(){return name;}
    public void setName(Long id){
        this.name=name;
    }
    public double getCashDistributions(){return cashDistributions;}
    public void setCashDistributions(double id){
        this.cashDistributions=cashDistributions;
    }
    public double getTaxCredits(){return taxCredits;}
    public void setTaxCredits(double taxCredits){
        this.taxCredits=taxCredits;
    }
    public double getPowerProduced(){return powerProduced;}    
    public void setPowerProduced(double powerProduced){
        this.powerProduced=powerProduced;
    }
    public double getCarbonAvoided(){return carbonAvoided;}
    public void setCarbonAvoided(double carbonAvoided){
        this.carbonAvoided=carbonAvoided;
    }
}
