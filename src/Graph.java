import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;

public class Graph {
    HashSet<CityVertex> allCities;

    public Graph() {
        this.allCities = new HashSet<CityVertex>();
    }

    public CityVertex addCity(String c) {
        CityVertex cv = new CityVertex(c);
        this.allCities.add(cv);
        return cv;
    }

    public LinkedList<CityVertex> findRoute(CityVertex start, CityVertex dest) {
        return start.findRoute(dest, new HashSet<CityVertex>());
    }

    public ArrayList<CityVertex> findTour(CityVertex start) {
        ArrayList<CityVertex> tour = new ArrayList<CityVertex>();
        tour.addAll(this.allCities);
        return tour;
    }
}
