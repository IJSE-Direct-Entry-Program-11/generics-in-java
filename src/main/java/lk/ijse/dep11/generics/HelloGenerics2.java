package lk.ijse.dep11.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HelloGenerics2 {

    public static void main(String[] args) {

        List<String> list1 = HelloGenerics2.<String>getFilledArrayList(10, "ijse");
        System.out.println(list1);

        List<LocalDate> list2 = HelloGenerics2.<LocalDate>getFilledArrayList(5, LocalDate.now());
        System.out.println(list2);

        List<Double> list3 = HelloGenerics2.getFilledArrayList(3, 10.25);
    }

    public static <T> List<T> getFilledArrayList(int size, T value) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(value);
        }
        return list;
    }
}
