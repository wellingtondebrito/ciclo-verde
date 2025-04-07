package com.br.futurodev.cicloVerde.cicloVerde.controllers;

import com.br.futurodev.cicloVerde.cicloVerde.dtos.RouteRequestDto;
import com.br.futurodev.cicloVerde.cicloVerde.dtos.RouteResponseDto;
import com.br.futurodev.cicloVerde.cicloVerde.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping
    public List<RouteResponseDto> getRoutes() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public RouteResponseDto getRouteById(@PathVariable Long id){
        return routeService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public RouteResponseDto createRoute(@RequestBody RouteRequestDto routeDto) {
        return routeService.createRoute(routeDto);
    }

    @PutMapping("/{id}")
    public RouteResponseDto updateRoute(@PathVariable Long id, @RequestBody RouteRequestDto routeDto) {
        return routeService.updateRoute(id, routeDto);
    }

    @DeleteMapping("/{id}")
    public RouteResponseDto deleteRoute(@PathVariable Long id) {
        return routeService.deleteRoute(id);
    }
}
