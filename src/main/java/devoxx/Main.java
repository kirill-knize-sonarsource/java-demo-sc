package devoxx;

public class Main {


}

enum BodyType {
  HIGH, HEAVY
}

class Person {
  BodyType bodyType;

  float height;
  float weight;

  @Override
  public String toString() {
    if (bodyType == BodyType.HIGH) {
      return "Person of height: " + height;
    }
    if (bodyType == BodyType.HEAVY) {
      return "Person weight: " + weight;
    }
    return "Can't happen why I have to write it help ";
  }
}
