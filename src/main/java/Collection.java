import java.util.*;

public class Collection {

    public static void main(String[] args) {
        Collection c = new Collection();
        c.Collection();
        c.arrayList();
        c.hashSet();
        c.hashMap();


    }

    public void Collection() {
        Collection collectionCar = new Collection();
        collectionCar.add("Set audi");
        collectionCar.add("Map bmw ");
        collectionCar.add("List kia ");
        System.out.println("Collection sets: " + collectionCar);

    }

    void add(String set_audi) {
    }

    public static void arrayList() {
        List<String> learners = new ArrayList<>();
        learners.add("Thalitha Nyeka");
        learners.add("Nthabeleng Jacobs");
        learners.add("Bontle Tiwani");
        System.out.println("grade 9 learners " + learners + "\n");

        learners.remove("Thalitha Nyeka");
        System.out.println("2020 grade 9 learners" + learners + "\n");
    }

    //set interface
    public void hashSet() {
        Set<String> clothes = new HashSet<>();
        clothes.add("crop top");
        clothes.add("mom  jean");
        clothes.add("dress");
        System.out.println("Initial List of clothes set" + clothes);
        clothes.remove("dress");
        System.out.println("Updated List of clothes set " + clothes);
    }

    //Map Interface
    public void hashMap() {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("key25", " Element24");
        mapA.put("key25", " Element25");
        mapA.put("key26 ", "Element26");
        System.out.println("Initial list of elements:");
        for (Map.Entry m : mapA.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        mapA.remove("key25", " Element25");
        for (Map.Entry m : mapA.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public void contains(String map_kia) {

    }
}
