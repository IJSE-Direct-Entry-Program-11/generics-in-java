package lk.ijse.dep11.generics;

import java.util.ArrayList;
import java.util.List;

public class HelloGenerics {

    public static void main(String[] args) {
//        List<Integer> numberList = List.of(10, 20, 30, 40, 50);
//        List<String> nameList = List.of("Kasun", "Nuwan", "Ruwan", "Supun");
//
//        String result1 = HelloGenerics.<Integer>reduce(numberList);
//        String result2 = HelloGenerics.<String>reduce(nameList);
//
//        System.out.println(result1);
//        System.out.println(result2);

        MyStack<String> myStack = new MyStack();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        myStack.push("d");
        myStack.print();
        String pop = myStack.pop();
        System.out.println("Removed: " + pop);
        pop = myStack.pop();
        System.out.println("Removed: " + pop);
        myStack.print();
    }

    private static <T> String reduce(List<T> list) {
        String result = "";
        for (T t : list) {
            result += t + ",";
        }
        return result;
    }

    static class MyStack<E> {
        Object[] values = new Object[0];

        void push(E value) {
            Object[] temp = new Object[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[values.length] = value;
            values = temp;
        }

        E pop() {
            Object[] temp = new Object[values.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = values[i];
            }
            Object k = values[temp.length];
            values = temp;
            return (E) k;
        }

        void print() {
            for (int i = values.length - 1; i >=0; i--) {
                System.out.println("----");
                System.out.println("|" + values[i] + "|");
            }
        }
    }
}
