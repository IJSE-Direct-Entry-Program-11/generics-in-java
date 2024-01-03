package lk.ijse.dep11.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardTypes {

    public static void main(String[] args) {
        List<Object> oList = new ArrayList<>();
        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();
        print(oList);
    }

    static void print(List<? super B> myList){
    }

    class A{}
    class B extends A{}
    class C extends B{}
}
