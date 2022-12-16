package main.java.ch3;

public class DogObject {
  String name;

  public void bark() {
    System.out.println(name + " says Ruff Ruff!");
  }
  public void eat() {
  }
  public void chaseCat() {
  }

  public static void main(String[] args) {
    DogObject myDog1 = new DogObject();
    myDog1.bark();
    myDog1.name = "Sabil";

    DogObject[] myDogs = new DogObject[3];
    // put some dogs in myDogs array
    myDogs[0] = new DogObject();
    myDogs[1] = new DogObject();
    myDogs[2] = myDog1;

    myDogs[0].name = "Arbi";
    myDogs[1].name = "Rafi";

    System.out.print("Last dogs name is ");
    System.out.println(myDogs[2].name);

    int x = 0;
    while (x < myDogs.length) {
      myDogs[x].bark();
      x += 1;
    }
  }
}
