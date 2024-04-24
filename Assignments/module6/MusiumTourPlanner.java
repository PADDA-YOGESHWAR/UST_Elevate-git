import java.util.*;

class Exhibit {
    private String name;
    private int id;

    public Exhibit(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Museum {
    private int[][] adjacencyMatrix;
    private Map<Integer, Exhibit> exhibits;

    public Museum(int numExhibits) {
        adjacencyMatrix = new int[numExhibits][numExhibits];
        exhibits = new HashMap<>();
    }

    public void addExhibit(Exhibit exhibit) {
        exhibits.put(exhibit.getId(), exhibit);
    }

    public void addConnection(int exhibit1Id, int exhibit2Id, int time) {
        adjacencyMatrix[exhibit1Id - 1][exhibit2Id - 1] = time;
        adjacencyMatrix[exhibit2Id - 1][exhibit1Id - 1] = time;
    }

    public int getDistance(int exhibit1Id, int exhibit2Id) {
        return adjacencyMatrix[exhibit1Id - 1][exhibit2Id - 1];
    }

    public Exhibit getExhibitById(int id) {
        return exhibits.get(id);
    }

    // Dijkstra's algorithm to find the shortest path
    public List<Exhibit> findShortestPath(int startId, List<Integer> desiredExhibits) {
        Map<Integer, Integer> distance = new HashMap<>();
        Map<Integer, Integer> previous = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(distance::get));

        for (int id : exhibits.keySet()) {
            distance.put(id, Integer.MAX_VALUE);
            previous.put(id, null);
            queue.add(id);
        }

        distance.put(startId, 0);

        while (!queue.isEmpty()) {
            int currentId = queue.poll();
            for (int neighborId : exhibits.keySet()) {
                if (adjacencyMatrix[currentId - 1][neighborId - 1] > 0) {
                    int alt = distance.get(currentId) + adjacencyMatrix[currentId - 1][neighborId - 1];
                    if (alt < distance.get(neighborId)) {
                        distance.put(neighborId, alt);
                        previous.put(neighborId, currentId);
                        queue.remove(neighborId);
                        queue.add(neighborId);
                    }
                }
            }
        }

        List<Exhibit> path = new ArrayList<>();
        int currentId = desiredExhibits.get(0); // Start with the first desired exhibit
        while (previous.get(currentId) != null && currentId != startId) {
            path.add(getExhibitById(currentId));
            currentId = previous.get(currentId);
        }

        return path;
    }
}

public class MusiumTourPlanner {
    public static void main(String[] args) {
        Exhibit monet = new Exhibit("Monet's Water Lilies", 1);
        Exhibit michelangelo = new Exhibit("Michelangelo's Pieta", 2);
        Exhibit egyptian = new Exhibit("Egyptian Sarcophagi", 3);
        Exhibit picasso = new Exhibit("Picasso's Guernica", 4);
        Exhibit vanGogh = new Exhibit("Van Gogh's Sunflowers", 5);

        Museum artMuseum = new Museum(5);
        artMuseum.addExhibit(monet);
        artMuseum.addExhibit(michelangelo);
        artMuseum.addExhibit(egyptian);
        artMuseum.addExhibit(picasso);
        artMuseum.addExhibit(vanGogh);

        artMuseum.addConnection(1, 2, 5); // Monet to Michelangelo
        artMuseum.addConnection(2, 3, 8); // Michelangelo to Egyptian
        artMuseum.addConnection(3, 4, 7); // Egyptian to Picasso
        artMuseum.addConnection(4, 5, 6); // Picasso to Van Gogh

        List<Integer> desiredExhibits = Arrays.asList(2, 3, 4, 5); // IDs of desired exhibits
        List<Exhibit> shortestPath = artMuseum.findShortestPath(1, desiredExhibits); // Start from Monet's Water Lilies (ID: 1)

        System.out.println("Most efficient tour sequence:");
        for (int i = shortestPath.size() - 1; i >= 0; i--) {
            System.out.println(shortestPath.get(i).getName());
        }

        int totalTime = 0;
        for (int i = 1; i < shortestPath.size(); i++) {
            totalTime += artMuseum.getDistance(shortestPath.get(i - 1).getId(), shortestPath.get(i).getId());
        }

        System.out.println("Total tour time: " + totalTime + " minutes");
    }
}
