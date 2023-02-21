package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_CreateAndIterateArray {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("blue","yellow","black","red"));

        System.out.println(colors);

        for (String eachColor : colors) {
            System.out.println(eachColor);
        }
        System.out.println("-----------------------------------");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }

}
/*
    3. Write a Java program to create a new array list,
    add some colors (string) and print out the collection by
    iterate through all elements in a array list.
     */