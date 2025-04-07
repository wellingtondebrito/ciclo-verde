package com.br.futurodev.cicloVerde.cicloVerde.controllers;

import com.br.futurodev.cicloVerde.cicloVerde.models.ContractModel;
import com.br.futurodev.cicloVerde.cicloVerde.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    private ContractService service;

    @GetMapping
    public List<ContractModel> getContracts() {
        return service.findAllContracts();
    }

    @PostMapping
    public ContractModel postContract(ContractModel contract) {
        return service.createContract(contract);
    }
}
