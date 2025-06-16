package com.metroapp.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
	
	Map<String, List<Edge>> adj = new HashMap<>();

    public static Graph initializeMetroGraph() {
        Graph g = new Graph();
        // populate stations and edges from THE-METRO-APP logic
     // Add edges for all metro lines. Example subset below (expand as needed):

        // Red Line
        g.addBidirectionalEdge("Rithala", "Netaji Subhash Place", 4);
        g.addBidirectionalEdge("Netaji Subhash Place", "Keshav Puram", 2);
        g.addBidirectionalEdge("Keshav Puram", "Kanhaiya Nagar", 2);
        g.addBidirectionalEdge("Kanhaiya Nagar", "Inderlok", 3);

        // Blue Line
        g.addBidirectionalEdge("Dwarka Sector 21", "Dwarka Sector 8", 2);
        g.addBidirectionalEdge("Dwarka Sector 8", "Dwarka Sector 9", 2);
        g.addBidirectionalEdge("Dwarka Sector 9", "Dwarka Sector 10", 2);
        g.addBidirectionalEdge("Dwarka Sector 10", "Dwarka Sector 11", 2);
        g.addBidirectionalEdge("Dwarka Sector 11", "Dwarka Sector 12", 2);
        g.addBidirectionalEdge("Dwarka Sector 12", "Dwarka Sector 13", 2);
        g.addBidirectionalEdge("Dwarka Sector 13", "Dwarka Sector 14", 2);
        g.addBidirectionalEdge("Dwarka Sector 14", "Dwarka", 2);
        g.addBidirectionalEdge("Dwarka", "Janakpuri West", 3);
        g.addBidirectionalEdge("Janakpuri West", "Janakpuri East", 2);
        g.addBidirectionalEdge("Janakpuri East", "Tilak Nagar", 2);
        g.addBidirectionalEdge("Tilak Nagar", "Subhash Nagar", 2);
        g.addBidirectionalEdge("Subhash Nagar", "Tagore Garden", 2);
        g.addBidirectionalEdge("Tagore Garden", "Rajouri Garden", 2);
        g.addBidirectionalEdge("Rajouri Garden", "Ramesh Nagar", 2);
        g.addBidirectionalEdge("Ramesh Nagar", "Moti Nagar", 2);
        g.addBidirectionalEdge("Moti Nagar", "Kirti Nagar", 2);
        g.addBidirectionalEdge("Kirti Nagar", "Shadipur", 2);
        g.addBidirectionalEdge("Shadipur", "Patel Nagar", 2);
        g.addBidirectionalEdge("Patel Nagar", "Rajendra Place", 2);
        g.addBidirectionalEdge("Rajendra Place", "Karol Bagh", 2);
        g.addBidirectionalEdge("Karol Bagh", "Jhandewalan", 2);
        g.addBidirectionalEdge("Jhandewalan", "R.K. Ashram Marg", 2);
        g.addBidirectionalEdge("R.K. Ashram Marg", "Rajiv Chowk", 2);
        g.addBidirectionalEdge("Rajiv Chowk", "Barakhamba Road", 1);
        g.addBidirectionalEdge("Barakhamba Road", "Mandi House", 1);
        g.addBidirectionalEdge("Mandi House", "Pragati Maidan", 2);
        g.addBidirectionalEdge("Pragati Maidan", "Indraprastha", 2);
        g.addBidirectionalEdge("Indraprastha", "Yamuna Bank", 2);
        g.addBidirectionalEdge("Yamuna Bank", "Akshardham", 2);
        g.addBidirectionalEdge("Akshardham", "Mayur Vihar Phase-1", 2);
        g.addBidirectionalEdge("Mayur Vihar Phase-1", "Mayur Vihar Extention", 2);
        g.addBidirectionalEdge("Mayur Vihar Extention", "New Ashok Nagar", 2);
        g.addBidirectionalEdge("New Ashok Nagar", "Noida Sector 15", 2);
        g.addBidirectionalEdge("Noida Sector 15", "Noida Sector 16", 2);
        g.addBidirectionalEdge("Noida Sector 16", "Noida Sector 18", 2);
        g.addBidirectionalEdge("Noida Sector 18", "Botanical Garden", 2);
        g.addBidirectionalEdge("Botanical Garden", "Golf Course", 2);
        g.addBidirectionalEdge("Golf Course", "Noida City Centre", 2);
        g.addBidirectionalEdge("Noida City Centre", "Noida Sector 34", 2);
        g.addBidirectionalEdge("Noida Sector 34", "Noida Sector 52", 2);
        g.addBidirectionalEdge("Noida Sector 52", "Noida Sector 61", 2);
        g.addBidirectionalEdge("Noida Sector 61", "Noida Sector 59", 2);
        g.addBidirectionalEdge("Noida Sector 59", "Noida Sector 62", 2);
        g.addBidirectionalEdge("Noida Sector 62", "Noida Electronic City", 2);

        // Violet Line
        g.addBidirectionalEdge("Kashmere Gate", "Lal Quila", 2);
        g.addBidirectionalEdge("Lal Quila", "Jama Masjid", 2);
        g.addBidirectionalEdge("Jama Masjid", "Delhi Gate", 2);
        g.addBidirectionalEdge("Delhi Gate", "ITO", 2);
        g.addBidirectionalEdge("ITO", "Mandi House", 2);
        g.addBidirectionalEdge("Mandi House", "Janpath", 2);
        g.addBidirectionalEdge("Janpath", "Central Secretariat", 2);
        g.addBidirectionalEdge("Central Secretariat", "Khan Market", 2);
        g.addBidirectionalEdge("Khan Market", "JLN Stadium", 2);
        g.addBidirectionalEdge("JLN Stadium", "Jangpura", 2);
        g.addBidirectionalEdge("Jangpura", "Lajpat Nagar", 2);
        g.addBidirectionalEdge("Lajpat Nagar", "Moolchand", 2);
        g.addBidirectionalEdge("Moolchand", "Kailash Colony", 2);
        g.addBidirectionalEdge("Kailash Colony", "Nehru Place", 2);
        g.addBidirectionalEdge("Nehru Place", "Kalkaji Mandir", 2);

        // Pink Line
        g.addBidirectionalEdge("Majlis Park", "Azadpur", 3);
        g.addBidirectionalEdge("Azadpur", "Shalimar Bagh", 3);
        g.addBidirectionalEdge("Shalimar Bagh", "Netaji Subhash Place", 2);
        g.addBidirectionalEdge("Netaji Subhash Place", "Shakurpur", 2);

        // Magenta Line
        g.addBidirectionalEdge("Janakpuri West", "Dabri Mor", 2);
        g.addBidirectionalEdge("Dabri Mor", "Dashrathpuri", 2);
        g.addBidirectionalEdge("Dashrathpuri", "Palam", 2);
        g.addBidirectionalEdge("Palam", "Sadar Bazaar Cantonment", 2);

        // Green Line
        g.addBidirectionalEdge("Inderlok", "Ashok Park Main", 2);
        g.addBidirectionalEdge("Ashok Park Main", "Punjabi Bagh", 2);
        g.addBidirectionalEdge("Punjabi Bagh", "Shivaji Park", 2);

        // Airport Express Line
        g.addBidirectionalEdge("New Delhi", "Shivaji Stadium", 4);
        g.addBidirectionalEdge("Shivaji Stadium", "Dhaula Kuan", 4);
        g.addBidirectionalEdge("Dhaula Kuan", "Delhi Aerocity", 5);
        g.addBidirectionalEdge("Delhi Aerocity", "IGI Airport", 3);
        
        // Correct Delhi Metro Interchanges
        g.addBidirectionalEdge("Kashmere Gate", "Tis Hazari", 2); // Red ↔ Violet
        g.addBidirectionalEdge("Kashmere Gate", "ISBT", 2); // Violet ↔ Yellow
        g.addBidirectionalEdge("Rajiv Chowk", "New Delhi", 2); // Blue ↔ Yellow
        g.addBidirectionalEdge("New Delhi", "Shivaji Stadium", 2); // Yellow ↔ Airport Express
        g.addBidirectionalEdge("Central Secretariat", "Khan Market", 2); // Yellow ↔ Violet
        g.addBidirectionalEdge("Central Secretariat", "Patel Chowk", 2); // Yellow ↔ Blue
        g.addBidirectionalEdge("Mandi House", "Barakhamba Road", 2); // Blue ↔ Violet
        g.addBidirectionalEdge("Kalkaji Mandir", "Govindpuri", 2); // Violet ↔ Magenta
        g.addBidirectionalEdge("Hauz Khas", "Green Park", 2); // Magenta ↔ Yellow
        g.addBidirectionalEdge("Janakpuri West", "Uttam Nagar East", 2); // Blue ↔ Magenta
        g.addBidirectionalEdge("Lajpat Nagar", "Vinobapuri", 2); // Violet ↔ Pink
        g.addBidirectionalEdge("South Extension", "INA", 2); // Pink ↔ Yellow
        g.addBidirectionalEdge("Azadpur", "Model Town", 2); // Pink ↔ Yellow
        g.addBidirectionalEdge("Netaji Subhash Place", "Keshav Puram", 2); // Red ↔ Pink
        g.addBidirectionalEdge("Inderlok", "Ashok Park Main", 2); // Red ↔ Green
        g.addBidirectionalEdge("Kirti Nagar", "Ashok Park Main", 2); // Blue ↔ Green
        g.addBidirectionalEdge("Botanical Garden", "Noida Sector 18", 2); // Blue ↔ Magenta
        g.addBidirectionalEdge("Yamuna Bank", "Laxmi Nagar", 2);
        g.addBidirectionalEdge("Mandi House", "Barakhamba Road", 2); 
        return g;
    }
    
    void addEdge(String from, String to, int weight) {
        adj.computeIfAbsent(from, k -> new ArrayList<>()).add(new Edge(to, weight));
    }

    void addBidirectionalEdge(String from, String to, int weight) {
        addEdge(from, to, weight);
        addEdge(to, from, weight);
    }

    List<Edge> getNeighbors(String station) {
        return adj.getOrDefault(station, new ArrayList<>());
    }

    public Set<String> getStations() {
        return adj.keySet();
    }
}
