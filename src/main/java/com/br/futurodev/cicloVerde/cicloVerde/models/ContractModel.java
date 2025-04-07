package com.br.futurodev.cicloVerde.cicloVerde.models;

import java.util.ArrayList;
import java.util.List;

public class ContractModel {
    private static Long sequence = 1L;
    private static List<ContractModel> contracts = new ArrayList<>();

    private Long id;
    private CollectorModel collector;
    private List<RouteModel> routes = new ArrayList<>();

    public ContractModel() {
        this.id = sequence++;
    }


    public static ContractModel addContract(ContractModel contract) {
        contracts.add(contract);
        return contract;
    }

    public static List<ContractModel> getContracts() {
        return contracts;
    }

    public CollectorModel getCollector() {
        return collector;
    }

    public void setCollector(CollectorModel collector) {
        this.collector = collector;
    }

    public List<RouteModel> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteModel> routes) {
        this.routes = routes;
    }
}
