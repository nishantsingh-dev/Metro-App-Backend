package com.metroapp.backend.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {
	
	public static List<String> findShortestPath(Graph graph, String source, String destination) {
        Map<String, Integer> dist = new HashMap<>();
        Map<String, String> prev = new HashMap<>();
        PriorityQueue<NodeDist> pq = new PriorityQueue<>(Comparator.comparingInt(nd -> nd.distance));

        for (String station : graph.getStations()) {
            dist.put(station, Integer.MAX_VALUE);
        }
        dist.put(source, 0);
        pq.add(new NodeDist(source, 0));

        while (!pq.isEmpty()) {
            NodeDist curr = pq.poll();
            if (curr.name.equals(destination)) break;

            for (Edge edge : graph.getNeighbors(curr.name)) {
                int newDist = dist.get(curr.name) + edge.weight;
                if (newDist < dist.getOrDefault(edge.to, Integer.MAX_VALUE)) {
                    dist.put(edge.to, newDist);
                    prev.put(edge.to, curr.name);
                    pq.add(new NodeDist(edge.to, newDist));
                }
            }
        }

        List<String> path = new LinkedList<>();
        for (String at = destination; at != null; at = prev.get(at)) {
            path.add(0, at);
        }
        if (path.size() == 1 && !path.get(0).equals(source)) return Collections.emptyList();
        return path;
    }

}
