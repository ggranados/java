package org.udemy.functionalprogramming.concepts.lazyinit;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.function.Supplier;

public class LazyInit {

    public static void main(String[] args) {

        Supplier<Employee[]> supplier = ()-> Employee.getData();

        final Employee[] bigResource;

        //only if this is true, the big resource will be supplied
        boolean haveTo = Boolean.TRUE;

        if(haveTo){
            bigResource =supplier.get();
        }




    }

}
