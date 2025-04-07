package com.br.futurodev.cicloVerde.cicloVerde.models;

import java.util.ArrayList;
import java.util.List;

public class RouteModel {

    private static Long sequence = 1L;
    private static final List<RouteModel> routes = new ArrayList<>();

    private Long id;
    private String description;
    private String coverageArea;
    private Double efficiency;

    public RouteModel() {
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

    public static List<RouteModel> getRoutes() {
        return routes;
    }

    public static RouteModel addRoute(RouteModel route) {
        routes.add(route);
        return route;
    }
}
