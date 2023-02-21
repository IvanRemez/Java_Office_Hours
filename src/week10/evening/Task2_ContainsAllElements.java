package week10.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_ContainsAllElements {

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5, 6));

        // Create Method shortcut:
        // Option + Return

        int[] result = mergeArrayLists(first, second);

        System.out.println(Arrays.toString(result));


    }

    public static int[] mergeArrayLists(ArrayList<Integer> first, ArrayList<Integer> second) {

        // 1st create new Array to contain the 2 ArrayLists
        // use size of each to set size of NEW Array:
        int[] result = new int[first.size()+ second.size()];

        // I need to get first ArrayList elements and add to NEW ArrayList 1 by 1:
        /*result[0] = 1;
        result[1] = 2;
        result[2] = 3;
        ^^ MANUAL WAY
         */
        int index = 0;

        for (Integer each : first) { // add using For Each loop

            result[index++] = each;
        }
        for (Integer each : second) {

            result[index++] = each;
        }

        return result;
    }

}
    /*
Task 2 :
Create a method that get two arraylists as a parameters the return the array
which contains all elements in it.
input:
first arraylist :1,2,3
second arraylist :4,5,6
output:
1,2,3,4,5,6
     */