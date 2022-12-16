package main.java.ch4;

public class SizeBark {
  int size;
  String name;

  public void Bark() {
    if (size > 60) {
      System.out.println("Woof Woof...");
    } else if (size > 14) {
      System.out.println("Ruuf Ruuf...");
    } else {
      System.out.println("Yip Yip....");
    }
  }

  public static void main(String[] args) {
    SizeBark one = new SizeBark();
    one.size = 70;
    SizeBark two = new SizeBark();
    two.size = 7;
    SizeBark three = new SizeBark();
    three.size = 35;

    one.Bark();
    two.Bark();
    three.Bark();
  }
}
