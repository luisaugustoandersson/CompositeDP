package org.arpit.javapostsforlearning.designpatterns;

public class CompositeDesignPatternMain {

 public static void main(String[] args) {
  Employee emp1 = new Developer("John", 10000);
  Employee emp2 = new Developer("David", 15000);
  Employee manager1= new Manager("Daniel",25000);
  manager1.add(emp1);
  manager1.add(emp2);
  //Daniel é gerente de david e john
  
  Employee emp3 = new Developer("Michael", 20000);
  Manager generalManager = new Manager("Mark", 50000);
  generalManager.add(emp3);
  generalManager.add(manager1);
  generalManager.print();
  //Mark é gerente geral de michael e do gerente Daniel
  
  
  
 }
}