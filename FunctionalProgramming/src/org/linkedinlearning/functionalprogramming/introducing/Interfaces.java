package org.linkedinlearning.functionalprogramming.introducing;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Comparator;

public class Interfaces {

    public static void main(String[] args) {

        Employee mike = new Employee("Mike", 2000),
                louise = new Employee("Louise", 2500);

        var byName = new Comparator<Employee>(){
            public int compare(Employee a, Employee b){
                return a.getName().compareTo(b.getName());
            }
        };

        System.out.println("By name");
        System.out.println(byName.compare(mike, louise));

    }
}
