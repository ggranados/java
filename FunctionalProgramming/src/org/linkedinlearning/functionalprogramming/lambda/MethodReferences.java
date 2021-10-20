package org.linkedinlearning.functionalprogramming.lambda;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Comparator;
import java.util.function.*;

public class MethodReferences {

	interface ThreadSupplier {
		Thread giveMeAThread();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Static method
		Supplier<Thread> s1 = Thread::currentThread;

		// Nothing special about 'Supplier'...
		ThreadSupplier ts = Thread::currentThread;


		// Instance method (instance specified)
		Employee frank = new Employee("Frank", 3000);

		Integer i = frank.getSalary();
		Supplier<Integer> s2 = frank::getSalary;

		System.out.println(s2.get());

		// A common instance method (instance specified)
		Consumer<String> c1 = System.out::println;
	}


}
