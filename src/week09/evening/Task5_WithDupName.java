package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5_WithDupName {

    public static void main(String[] args) {

// extra practice to find Index # of duplicated elements

        ArrayList<String> names = new ArrayList<>(Arrays.asList
                ("Mike", "Adam", "Alvin", "Hamid", "Tijana", "Adam"));

        String searched = "Adam";
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).equals(searched)){ // get name if name = searched name (Adam)
                indexes.add(i); // then add it's index to the indexes list
            }
        } // Adam at index 1 and 5 -> get added to indexes ArrayList:

        System.out.println("indexes = " + indexes); // [1, 5]

        int index = 0; // index set to 0 to start iterating
        ArrayList<Integer> indexes2 = new ArrayList<>();

        for (String name : names) {

            index++; // iterating index with each execution of loop

            if (name.equals(searched)){
                indexes2.add(index - 1);
                // because we are incrementing index you need to subtract 1 (index - 1)
            }
        }
        System.out.println("indexes2 = " + indexes2);

    }
}
