package com.br.futurodev.cicloVerde.cicloVerde.dtos;

import com.br.futurodev.cicloVerde.cicloVerde.models.CollectorModel;
import com.br.futurodev.cicloVerde.cicloVerde.models.RouteModel;

import java.util.List;

public record ContractResponseDto(
        Long id,
        CollectorModel collector,
        List<RouteModel> route
) {}
