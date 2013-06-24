/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
package org.arpit.javapostsforlearning.designpatterns;

public interface Employee {

     public void add(Employee employee);
     public void remove(Employee employee);
     public Employee getChild(int i);
     public String getName();
     public double getSalary();
     public void print();
}