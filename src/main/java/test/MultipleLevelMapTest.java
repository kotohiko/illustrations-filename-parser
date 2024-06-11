package test;

import java.util.HashMap;

public class MultipleLevelMapTest {
    public static void main(String[] args) {
        var map = new HashMap<String, Object>();
        var map2 = new HashMap<String, String>() {{
            put("map2A", "map2A");
            put("map2B", "map2B");
        }};
        var map3 = new HashMap<String, String>() {{
            put("map3A", "map3A");
            put("map3B", "map3B");
            put("map3C", "map3C");
        }};
        var map4 = new HashMap<String, String>() {{
            put("map4A", "map4A");
            put("map4B", "map4B");
            put("map4C", "map4C");
            put("map4D", "map4D");
        }};
        map.put("map1", "map1");
        map.put("map2", map2);
        map.put("map3", map3);
        map.put("map4", map4);
        map.forEach((k, v) -> System.out.println(k + "," + v));
    }
}
