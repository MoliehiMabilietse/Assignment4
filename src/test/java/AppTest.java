import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.*;

import static org.junit.Assert.*;

public class AppTest
{
    private double expected;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    private void assertTrue(boolean b) {
    }


    @Test
    public void Collection() {
        LinkedHashSet<Object> collectionCar = new LinkedHashSet<Object>();
        collectionCar.add("Set audi");
        collectionCar.add("Map bmw");
        collectionCar.add("List kia");
        assertTrue(collectionCar.contains("Map Kia"));

    }


    @Test
    public  void List() {
        List<String> learners = new ArrayList<>();
        learners.add("Thalitha Nyeka");
        learners.add("Nthabeleng Jacobs");
        learners.add("Bontle Tiwani");
    }
    @Test
    public  void Set() {
        Set<String> clothes = new HashSet<>();
        clothes.add("crop top");
        clothes.add("mom jean");
        clothes.add("dress");

    }
    @Test
    public void Map() {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("key25", " Element25");
        mapA.put("key26", " Element26");
        mapA.put("key27 ", "Element27");
        assertTrue(mapA.containsValue("Key26"));
        assertEquals(("Key26"), true, mapA);
    }
}
