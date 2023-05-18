public class DirectAddressTable {

  public static void main(String[] args) {
    DAT dat = new DAT();
    dat.insert(10);
    dat.insert(20);
    dat.insert(119);
    System.out.println(dat.search(10));
    System.out.println(dat.search(20));
    dat.delete(119);
    System.out.println(dat.search(119));
  }
}

class DAT {

  int[] table = new int[1000];

  void insert(int x) {
    table[x] = 1;
  }

  void delete(int x) {
    table[x] = 0;
  }

  int search(int x) {
    return table[x];
  }
}
