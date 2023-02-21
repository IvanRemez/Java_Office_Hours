package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4_InsertElement {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.addAll(Arrays.asList("dog","cat","squirrel","fox","wolf"));

        System.out.println(animals);

        animals.add(0, "sheep");
        System.out.println(animals);

        System.out.println(animals.get(1));

        animals.set(0, "lion");
        System.out.println(animals);

        animals.remove(2);
        System.out.println(animals);


    }
}
/*
    4. Write a Java program to insert an element into the array list at the
    first position. Then retrieve an element (at a specified index) from the
    array list. Then update specific array element by given element.
    Lastly remove the third element from the array list.
     */