package com.br.futurodev.cicloVerde.cicloVerde.services;

import com.br.futurodev.cicloVerde.cicloVerde.dtos.RouteRequestDto;
import com.br.futurodev.cicloVerde.cicloVerde.dtos.RouteResponseDto;
import com.br.futurodev.cicloVerde.cicloVerde.models.RouteModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService {

    public RouteResponseDto createRoute(RouteRequestDto routeDto) {

        RouteModel route = new RouteModel();
        route.setDescription(routeDto.description());
        route.setCoverageArea(routeDto.coverageArea());
        route.setEfficiency(routeDto.efficiency());
        RouteModel.addRoute(route);
        return new RouteResponseDto(
                route.getId(),
                route.getDescription(), route.getCoverageArea(),
                route.getEfficiency());
    }

    public List<RouteResponseDto> getAllRoutes() {
        List<RouteResponseDto> routes = new ArrayList<>();
        for (RouteModel route : RouteModel.getRoutes()) {
            routes.add(new RouteResponseDto(
                    route.getId(),
                    route.getDescription(),
                    route.getCoverageArea(),
                    route.getEfficiency()));
        }
        return routes;
    }

    public RouteModel findRouteById(Long id) {
        for (RouteModel route : RouteModel.getRoutes()) {
            if (route.getId().equals(id)) {
                return route;
            }
        }
        return null;
    }

    public RouteResponseDto findById(Long id) {
        RouteModel route = findRouteById(id);
        if (route != null) {
            return new RouteResponseDto(
                    route.getId(),
                    route.getDescription(),
                    route.getCoverageArea(),
                    route.getEfficiency());
        }
        return null;
    }

    public RouteResponseDto updateRoute(Long id, RouteRequestDto routeDto) {
        RouteModel route = findRouteById(id);
        if (route != null) {
            route.setDescription(routeDto.description());
            route.setCoverageArea(routeDto.coverageArea());
            route.setEfficiency(routeDto.efficiency());
            return new RouteResponseDto(
                    route.getId(),
                    route.getDescription(),
                    route.getCoverageArea(),
                    route.getEfficiency());
        }
        return null;
    }

    public RouteResponseDto deleteRoute(Long id) {
        RouteModel route = findRouteById(id);
        if (route != null) {
            RouteModel.getRoutes().remove(route);
            return new RouteResponseDto(
                    route.getId(),
                    route.getDescription(),
                    route.getCoverageArea(),
                    route.getEfficiency());
        }
        return null;
    }

}
