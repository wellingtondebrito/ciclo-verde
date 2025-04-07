package com.br.futurodev.cicloVerde.cicloVerde.services;

import com.br.futurodev.cicloVerde.cicloVerde.dtos.CollectorRequestDto;
import com.br.futurodev.cicloVerde.cicloVerde.dtos.CollectorResponseDto;
import com.br.futurodev.cicloVerde.cicloVerde.models.CollectorModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CollectorService {

    public CollectorResponseDto createCollector(CollectorRequestDto collectorDto){
        CollectorModel collector = new CollectorModel();
        collector.setName(collectorDto.name());
        collector.setDescription(collectorDto.description());
        CollectorModel.addCollector(collector);
        return new CollectorResponseDto(
                collector.getId(),
                collector.getName(),
                collector.getDescription());
    }

    public List<CollectorResponseDto> getAllCollectors() {
        List<CollectorResponseDto> collectors = new ArrayList<>();
        for (CollectorModel collector : CollectorModel.getCollectors()) {
            collectors.add(new CollectorResponseDto(
                    collector.getId(),
                    collector.getName(),
                    collector.getDescription()));
        }
        return collectors;
    }

    public CollectorModel findeCollectorById(Long id){
        for (CollectorModel collector : CollectorModel.getCollectors()) {
            if (collector.getId().equals(id)) {
                return collector;
            }
        }
        return null;
    }

    public CollectorResponseDto findById(Long id) {
        CollectorModel collector = findeCollectorById(id);
        if (collector != null) {
            return new CollectorResponseDto(
                    collector.getId(),
                    collector.getName(),
                    collector.getDescription());
        }
        return null;
    }

    public CollectorResponseDto updateCollector(Long id, CollectorRequestDto collectorDto) {
        CollectorModel collector = findeCollectorById(id);
        if (collector != null) {
            collector.setName(collectorDto.name());
            collector.setDescription(collectorDto.description());
            return new CollectorResponseDto(
                    collector.getId(),
                    collector.getName(),
                    collector.getDescription());
        }
        return null;
    }

    public CollectorResponseDto deleteCollector(Long id) {
        CollectorModel collector = findeCollectorById(id);
        if (collector != null) {
            CollectorModel.getCollectors().remove(collector);
            return new CollectorResponseDto(
                    collector.getId(),
                    collector.getName(),
                    collector.getDescription());
        }
        return null;
    }

}
