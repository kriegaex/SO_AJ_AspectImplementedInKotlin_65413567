package de.scrum_master.stackoverflow.q65413567.app;

import de.scrum_master.stackoverflow.q65413567.aspect.MyAnnotation;

public class Application {
  public static void main(String[] args) {
    new Application().doSomething();
  }

  @MyAnnotation
  public void doSomething() {
    System.out.println("Doing something");
  }
}
