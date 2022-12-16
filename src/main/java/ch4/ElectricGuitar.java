package main.java.ch4;

public class ElectricGuitar {
  String brand;
  int numOfPickups;
  boolean rockstarUsesIt;

  String getBrand() {
    return brand;
  }
  public void setBrand(String abrand) {
    brand = abrand;
  }

  int getNumOfPickups() {
    return numOfPickups;
  }
  public void setNumOfPickups(int anumOfPickups) {
    numOfPickups = anumOfPickups;
  }

  public boolean isRockstarUsesIt() {
    return rockstarUsesIt;
  }
  public void setRockstarUsesIt(boolean yesOrno) {
    this.rockstarUsesIt = yesOrno;
  }
}
