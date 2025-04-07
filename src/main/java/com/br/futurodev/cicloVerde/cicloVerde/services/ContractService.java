package com.br.futurodev.cicloVerde.cicloVerde.services;

import com.br.futurodev.cicloVerde.cicloVerde.controllers.CollectorController;
import com.br.futurodev.cicloVerde.cicloVerde.dtos.ContractResponseDto;
import com.br.futurodev.cicloVerde.cicloVerde.models.CollectorModel;
import com.br.futurodev.cicloVerde.cicloVerde.models.ContractModel;
import com.br.futurodev.cicloVerde.cicloVerde.models.RouteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService {

    @Autowired
    private RouteService routeService;

    @Autowired
    private CollectorService collectorService;
    
    public ContractModel createContract(ContractModel contract) {
        CollectorModel collector = collectorService.findeCollectorById(contract.getCollector().getId());
        if(collector == null){
            return null;
        } else {
            contract.setCollector(collector);
        }

        List<RouteModel> routes = new ArrayList<>();
        for (RouteModel route : contract.getRoutes()) {
            RouteModel existingRoute = routeService.findRouteById(route.getId());
            if (existingRoute != null) {
                routes.add(existingRoute);
            }
            contract.setRoutes(routes);
        }
        return ContractModel.addContract(contract);
    }

    public List<ContractModel> findAllContracts() {
        return ContractModel.getContracts();
    }
    
}
