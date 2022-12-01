package interview;

import java.util.HashMap;
import java.util.Map;

public class MapUpdateTest{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("IN", "India");
        map.put("USA", "United States of America");
        map.put("CN", "China");
        map.put("PK", "Pakistan");
        map.put("UK", "United Kingdom");

        map.entrySet().stream().forEach(System.out::println);

        map.computeIfPresent("USA", (key, value) -> "United States");

        map.keySet().iterator()
          .forEachRemaining(System.out::println);
        
        map.values().iterator().forEachRemaining(System.out::println);
    }
}