import java.util.LinkedList;
import java.util.HashSet;

public class CityVertex {
    public LinkedList<CityVertex> toCities;
    public String name;

    public CityVertex(String nm) {
        this.name = nm;
        this.toCities = new LinkedList<CityVertex>();
    }

    public void addEdge(CityVertex toVertex) {
        this.toCities.add(toVertex);
    }

    public LinkedList<CityVertex> findRoute(CityVertex dest,
                                            HashSet<CityVertex> visited) {
        if (this == dest) {
            LinkedList<CityVertex> path = new LinkedList<>();
            path.addFirst(this);
            return path;
        }

        for (CityVertex neighbor : this.toCities) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                LinkedList<CityVertex> tryRoute = neighbor.findRoute(dest, visited);
                if (tryRoute != null) {
                    tryRoute.addFirst(this);
                    return tryRoute;
                }
            }
        }
        return null;
    }

    public String toString() {
        return this.name;
        /*
        String retstring = "City " + this.name + " goes to { ";
        for (CityVertex toCity : this.toCities) {
            retstring += toCity.name + " ";
        }
        retstring += "}";
        return retstring;
        */
    }
}
