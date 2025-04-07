package com.br.futurodev.cicloVerde.cicloVerde.models;

import java.util.ArrayList;
import java.util.List;

public class ContractModel {
    private static Long sequence = 1L;
    private static List<ContractModel> contracts = new ArrayList<>();

    private Long id;
    private CollectorModel collector;
    private RouteModel route;

    public ContractModel() {
        this.id = sequence++;
    }

    public static List<ContractModel> getContracts() {
        return contracts;
    }

    public static ContractModel addContract(ContractModel contract) {
        contracts.add(contract);
        return contract;
    }

    public Long getId() {
        return id;
    }

    public CollectorModel getCollector() {
        return collector;
    }

    public void setCollector(CollectorModel collector) {
        this.collector = collector;
    }

    public RouteModel getRoute() {
        return route;
    }

    public void setRoute(RouteModel route) {
        this.route = route;
    }
}
