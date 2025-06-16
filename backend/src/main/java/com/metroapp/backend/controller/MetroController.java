package com.metroapp.backend.controller;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metroapp.backend.services.MetroService;

@RestController
@RequestMapping("/api")
class MetroController {

    private final MetroService metroService = new MetroService();

    @GetMapping("/path")
    public List<String> getShortestPath(@RequestParam String source, @RequestParam String destination) {
        return metroService.findPath(source, destination);
    }
    
    @GetMapping("/stations") // ✅ This is the endpoint your frontend is calling
    public Set<String> getAllStations() {
        return metroService.getAllStations();
    }
}