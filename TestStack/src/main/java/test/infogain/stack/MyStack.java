package test.infogain.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class MyStack {
    private static Logger logger = LoggerFactory.getLogger(MyStack.class);
    private Stack<Integer> stack;

    public MyStack(){
        stack = new Stack<>();
    }

    public void push(Integer a) {
        stack.add(a);
    }

    public Integer top() {
        return stack.peek();
    }

    public void clear() {
        stack.clear();
    }

    public Integer pop() {
        return stack.pop();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }
}
