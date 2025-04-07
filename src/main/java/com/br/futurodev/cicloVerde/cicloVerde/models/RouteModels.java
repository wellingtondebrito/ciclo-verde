package com.br.futurodev.cicloVerde.cicloVerde.models;

public class RouteModels {

    private static Long sequence = 1L;

    private Long id;
    private String description;
    private String coverageArea;
    private Double efficiency;

    public RouteModels() {
        this.id = sequence++;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverageArea() {
        return coverageArea;
    }

    public void setCoverageArea(String coverageArea) {
        this.coverageArea = coverageArea;
    }

    public Double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }
}
