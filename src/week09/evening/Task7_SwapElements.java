package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7_SwapElements {

    /*
7. Write a Java program of swap two elements in an array list.
 */

    public static void main(String[] args) {
//assume that elements are unique

        ArrayList<String> names = new ArrayList<>(Arrays.asList
                ("Adam", "Alvin", "Aaron", "Gurhan", "Aysun"));
        System.out.println(names);

        //create a method which is swapElement
        //   ArrayList<String> result = swapElemnt("Adam", "Aaron", names);

        // Collections.swap(); we are not able to use it

        //"Aaron", "Alvin", "Adam", "Gurhan", "Aysun"

        //names.indexOf() do not use


    }
}
