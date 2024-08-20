package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        Integer peek = stack.peek();
        System.out.println("peek = " + peek);

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);

        //마지막에 넣은게 먼저 나옴 후입 선출 마지막에 넣은게 먼저 나온다.

        //Stack 은 Vector 를 사용하는데, 예전에 개발된 vector 를 기반으로 만들어져 사용하기를 권장하지 않는다.
    }
}
