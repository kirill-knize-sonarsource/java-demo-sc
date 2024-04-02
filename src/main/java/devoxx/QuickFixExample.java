package devoxx;

public class QuickFixExample extends ParentClass {

  public boolean doSomething() { // the method is overridden. Try Quick Fix!
    return false;
  }
}

class ParentClass {
  public boolean doSomething() {
    return true;
  }
}
