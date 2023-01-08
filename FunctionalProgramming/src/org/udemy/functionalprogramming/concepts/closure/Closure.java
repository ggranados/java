package org.udemy.functionalprogramming.concepts.closure;

public class Closure {

    public static void main(String[] args) {

        int val = 111;

        MyTask task = () -> {
            System.out.println(val);
            System.out.println("Task completed");
        };

        printTask(task);
    }

    private static void printTask(MyTask task) {
        task.doTask();
    }
}
