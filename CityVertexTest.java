import org.junit.Assert;
import org.junit.Test;

public class CityVertexTest {

    @Test
    public void testGraphExample()
    {
        CityVertex man = new CityVertex("Manchester");
        CityVertex bos = new CityVertex("Boston");
        CityVertex pvd = new CityVertex("Providence");
        CityVertex wor = new CityVertex("Worcester");
        CityVertex har = new CityVertex("Hartford");

        man.addEdge(bos);
        bos.addEdge(pvd);
        bos.addEdge(wor);
        pvd.addEdge(bos);
        wor.addEdge(har);

    }
}
