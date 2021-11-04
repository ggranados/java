package org.linkedinlearning.functionalprogramming.introducing;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Comparator;

public class Interfaces {

    public static void main(String[] args) {

        Employee mike = new Employee("Mike", 2000),
                louise = new Employee("Louise", 2500);

        // implemented with anonymous class
        var byName = new Comparator<Employee>(){
            public int compare(Employee a, Employee b){
                return a.getName().compareTo(b.getName());
            }
        };

        System.out.println("By name");
        System.out.println(byName.compare(mike, louise));

        // comparator doesn't support null
        try {
            System.out.println(byName.compare(mike, null));
        }catch (NullPointerException e){
            System.out.println(e);
        }

        // static method in comparator
        var byNameThenNull = Comparator.nullsLast(byName);

        System.out.println("Then null");
        System.out.println(byNameThenNull.compare(mike, louise));
        System.out.println(byNameThenNull.compare(mike, null));

        // a default method in Comparator
        var nullThenByDecreasingName = byNameThenNull.reversed();
        System.out.println("Reversed");
        System.out.println(byNameThenNull.compare(mike, louise));
        System.out.println(byNameThenNull.compare(mike, null));

    }
}
