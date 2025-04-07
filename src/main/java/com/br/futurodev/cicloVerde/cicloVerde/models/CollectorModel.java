package com.br.futurodev.cicloVerde.cicloVerde.models;

import java.util.ArrayList;
import java.util.List;

public class CollectorModel {

    private static Long sequence = 1L;
    private static List<CollectorModel> collectors = new ArrayList<>();

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

    public static List<CollectorModel> getCollectors() {
        return collectors;
    }

    public static CollectorModel addCollector(CollectorModel collector) {
        collectors.add(collector);
        return collector;
    }
}
