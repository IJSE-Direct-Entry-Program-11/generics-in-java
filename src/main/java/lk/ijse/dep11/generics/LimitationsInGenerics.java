package lk.ijse.dep11.generics;

import java.util.ArrayList;
import java.util.List;

public class LimitationsInGenerics {

    /* 1. Type argument can't be a primitive data type
     *    It should be a reference data type */
    // MyClass<int> myClass = null;
    MyClass<Integer> myClass = null;

    /* 3. Can't define parameterized array types */
    // MyClass<Integer>[] myArrayClass = new MyClass<Integer>[10];
    // ArrayList<String>[] myStringArrayList = new ArrayList<String>[10];

    /* 4. Parameterized types can't be casted  */
    // MyClass<Number> myClass2 = (MyClass<Number>) myClass;
    /* 5. Parameterized types can't be used with instanceof operator */
    // boolean anInstance = myClass instanceof MyClass<Integer>;

    static class MyClass<T> {
        T t;        // This is okay

        /* 2. Static fields can't be defined with generic type placeholders */
        // static T t2;

        /* 6. Type placeholders can't be used with throw and catch clauses
        *  But type placeholders can be used with throws clause if needed */
//        <E extends Exception> void myMethod() throws E {
//            try {
//                if (true) throw T;
//            }catch (T t){
//
//            }
//        }

        /* 7. Type placeholders can't be instantiated */
        // T t2 = new T();

        /* 8. */
        // public void doSomething(List<String> nameList){}
        // public void doSomething(List<Integer> numberList){}
    }
}
