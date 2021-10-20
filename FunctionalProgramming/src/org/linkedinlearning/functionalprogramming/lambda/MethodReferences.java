package org.linkedinlearning.functionalprogramming.lambda;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Comparator;
import java.util.function.*;

public class MethodReferences {


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Static method
		Supplier<Thread> s1 = Thread::currentThread;

	}
}
