package com.metroapp.backend.services;

import java.util.List;
import java.util.Set;

import com.metroapp.backend.model.Dijkstra;
import com.metroapp.backend.model.Graph;

public class MetroService {
	
	private final Graph graph;

    public MetroService() {
        // Assume this initializes the graph with stations and connections
        this.graph = Graph.initializeMetroGraph();
    }

    public List<String> findPath(String source, String destination) {
        return Dijkstra.findShortestPath(graph, source, destination);
    }
    
    public Set<String> getAllStations() {
        return graph.getStations(); // This must return a set of all station names
    }

}
