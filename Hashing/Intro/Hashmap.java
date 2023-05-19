import java.util.HashMap;
import java.util.Map;

public class Hashmap {

  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("gfg", 10);
    map.put("ide", 15);
    map.put("course", 20);
    System.out.println(map);
    System.out.println(map.size());
    for (Map.Entry<String, Integer> e : map.entrySet()) System.out.println(
      e.getKey() + " " + e.getValue()
    );
    if (map.containsKey("ide")) System.out.println(
      "yes"
    ); else System.out.println("no");
    map.remove("ide");

    if (map.containsValue(15)) System.out.println(
      "yes"
    ); else System.out.println("no");
    System.out.println(map.get("gfg"));
    System.out.println(map.get("practive"));
  }
}
