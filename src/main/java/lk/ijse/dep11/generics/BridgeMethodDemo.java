package lk.ijse.dep11.generics;

public class BridgeMethodDemo {

    public static void main(String[] args) {

    }

    static class Super<T>{
        void doSomething(T t){
            System.out.println("SuperClass: Method");
        }
    }

    static class Sub extends Super<Integer>{
        @Override
        void doSomething(Integer integer) {
            System.out.println("SubClass: Method");
        }
    }
}
