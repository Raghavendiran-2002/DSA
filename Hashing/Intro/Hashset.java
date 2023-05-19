import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

  public static void main(String[] args) {
    HashSet<String> h = new HashSet<String>();
    h.add("gfg");
    h.add("courses");
    h.add("ide");
    System.out.println(h.add("geeks")); // returns True
    System.out.println(h.size());
    System.out.println(h.remove("gfg"));
    System.out.println(h.size());
    System.out.println(h);
    System.out.println(h.contains("ide"));
    Iterator<String> i = h.iterator();
    while (i.hasNext()) {
      System.out.print(i.next() + " ");
    }
    for (String k : h) {
      System.out.print(k + " ");
    }
    System.out.println(h.isEmpty());
    h.clear();
    System.out.println(h.size());
  }
}
