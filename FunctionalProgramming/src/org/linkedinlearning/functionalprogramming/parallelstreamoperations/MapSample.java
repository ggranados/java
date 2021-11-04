package org.linkedinlearning.functionalprogramming.parallelstreamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.concurrent.atomic.LongAdder;

public class MapSample {

    public static void main(String[] args) {

        var totalSalary = Arrays.stream(Employee.getData())
                .parallel()
                .mapToInt(Employee::getSalary)
                .peek((x)-> System.out.println(Thread.currentThread().getId())) //prints the thread id running
                .sum();

        System.out.println("Total:"+totalSalary);


        SalaryAdder adder = new SalaryAdder();

        Arrays.stream(Employee.getData())
                .parallel()
                .forEach(adder::accept);

        var sumSalary = adder.total.longValue();
    }

    public static class SalaryAdder{
        LongAdder total;
        public void accept (Employee e){
            total.add(e.getSalary());
        }
    }
}

