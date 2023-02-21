package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5_CollectionsUtilityPractice {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.addAll(Arrays.asList("dog","cat","squirrel","fox","wolf"));
        System.out.println(animals);

// search for an element

        String animal = "wolf";

        for (String each : animals) { // can use forEach to print element but NOT get it's index
            if (each.equalsIgnoreCase(animal)){
                System.out.println(each);
            }
        }
// get element's index #

        for (int i = 0; i < animals.size(); i++) { // fori loop to get index of "wolf"

            String temp = animals.get(i);

            if (temp.equals(animal)){
                System.out.println(i);
                break;
            }
        }
        System.out.println(animals.indexOf("wolf")); // indexOf method using the element itself
        System.out.println("--------------------------------------");

// sort ArrayList

        Collections.sort(animals);
        System.out.println(animals);

// add one ArrayList to another

        ArrayList<String> animals2 = new ArrayList<>();
        animals2.addAll(Arrays.asList("cheetah","jaguar","leopard"));

        animals.addAll(animals2);
        System.out.println(animals);
        System.out.println("--------------------------------------");

// OR Copy one list to a new one:

        ArrayList<String> animals3 = new ArrayList<>(animals);
        System.out.println(animals3);
        System.out.println("--------------------------------------");

        Collections.shuffle(animals3); // Shuffles list randomly
        System.out.println(animals3);

        Collections.reverse(animals); // Reverses list using Collections method
        System.out.println(animals);

        ArrayList<String> animalsReversed = new ArrayList<>();
        for (int i = animals.size() - 1; i >= 0; i--) {
            animalsReversed.add(animals.get(i));
        }// Reverses list using reversed fori Loop

    }
}
/*
5. (Use Collections Utility Class) Search an element in an array list
then sort the given array list. Copy one array list into another.
Shuffle elements in a array list. Reverse elements in a array list.
 */