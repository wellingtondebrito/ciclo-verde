package com.br.futurodev.cicloVerde.cicloVerde.controllers;

import com.br.futurodev.cicloVerde.cicloVerde.dtos.CollectorRequestDto;
import com.br.futurodev.cicloVerde.cicloVerde.dtos.CollectorResponseDto;
import com.br.futurodev.cicloVerde.cicloVerde.services.CollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collectors")
public class CollectorController {
    @Autowired
    private CollectorService collectorService;

    @GetMapping
    public List<CollectorResponseDto> getCollectors() {
        return collectorService.getAllCollectors();
    }

    @GetMapping("/{id}")
    public CollectorResponseDto getCollectorById(@PathVariable Long id) {
        return collectorService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CollectorResponseDto createCollector(@RequestBody CollectorRequestDto collectorDto) {
        return collectorService.createCollector(collectorDto);
    }

    @PutMapping("/{id}")
    public CollectorResponseDto updateCollector(@PathVariable Long id, @RequestBody CollectorRequestDto collectorDto) {
        return collectorService.updateCollector(id, collectorDto);
    }

    @DeleteMapping("/{id}")
    public CollectorResponseDto deleteCollector(@PathVariable Long id) {
        return collectorService.deleteCollector(id);
    }

}
