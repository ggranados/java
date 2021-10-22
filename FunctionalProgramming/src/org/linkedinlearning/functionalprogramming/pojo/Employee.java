package org.linkedinlearning.functionalprogramming.pojo;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Employee[] getData(){
        Employee dept[] = new Employee[8];
        dept[0] = new Employee("Alec", 1500);
        dept[1] = new Employee("Bob", 1600);
        dept[2] = new Employee("Claire", 1700);
        dept[3] = new Employee("Danielle", 1800);
        dept[4] = new Employee("Ethan", 1900);
        dept[5] = new Employee("Bob", 1000);
        dept[6] = new Employee("Alex", 1900);
        dept[7] = new Employee("Bob", 1900);

        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    private static Random rand = new Random();
    public static Employee[] randomlyGenerate(int n) {
        return Stream.generate(() -> {
            final int NAME_LENGTH = 10;
            String name =  rand.ints(NAME_LENGTH, 0, 25)
                    .mapToObj(i -> "" + (char)(61+i))
                    .collect(Collectors.joining());
            return new Employee(name, rand.nextInt(10000));
        }).limit(n).toArray(Employee[]::new);
    }
}

