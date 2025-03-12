import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class CityVertexTest {

    @Test
    public void testGraphExample()
    {
        Graph g = new Graph();

        CityVertex man = g.addCity("Manchester");
        CityVertex bos = g.addCity("Boston");
        CityVertex pvd = g.addCity("Providence");
        CityVertex wor = g.addCity("Worcester");
        CityVertex har = g.addCity("Hartford");

        man.addEdge(bos);
        bos.addEdge(pvd);
        bos.addEdge(wor);
        pvd.addEdge(bos);
        wor.addEdge(har);

        LinkedList<CityVertex> route = g.findRoute(man,har);
        System.out.println(route);
        System.out.println(g.findTour(bos));

    }
}
