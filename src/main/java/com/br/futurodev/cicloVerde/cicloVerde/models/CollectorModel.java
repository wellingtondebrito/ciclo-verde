package com.br.futurodev.cicloVerde.cicloVerde.models;

public class CollectorModel {

    private static Long sequence = 1L;

    private Long id;
    private String name;
    private String description;

    public CollectorModel() {
        this.id = sequence++;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
