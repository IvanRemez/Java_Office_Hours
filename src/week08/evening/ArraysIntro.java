package week08.evening;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // we can put 1 value inside one variable

        int a = 5;
        // I want to put multiple values inside the variable
        // if we don't know the values, we need to use "new" keyword to allocate
        // enough memory (array length)
        // dataType arraysSymbol = new array[Length]
        int[] numbers = new int[5];

        numbers[0] = 12; // assigns 12 int to index 0
        numbers[1] = 13;
        numbers[2] = 14;
        numbers[3] = 15;
        numbers[4] = 16;

        // how to print the values: Arrays.toString(numbers)

        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------------------------------------");

        // how to create array when values are known:

                // indexes:    0      1       2       3      4      5       6
        String[] weekDays = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};

        System.out.println("weekDays[3] = " + weekDays[3]);

    // Shortcut: "itar" - creates fori loop and assigns each element to its own variable
            // used for manipulating/printing each element
    // ^^ similar to .for each loop shortcut

        for (int i = 0; i < weekDays.length; i++) {
            String weekDay = weekDays[i];
            System.out.print(weekDay + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        // print the elements

        for (String weekDay : weekDays) {
            System.out.print(weekDay + " ");
        }
        System.out.println();

        // print the chars 1 by 1:

        String name = "Adam";

        name.toCharArray(); // background >> char[] chars = {'A', 'd' , 'a', 'm'};

        for (char c : name.toCharArray()) {
            System.out.print(c + " ");
        }

        // iter = foreach loop shortcut (can choose which array in class to iterate)
        System.out.println();
        System.out.println("---------------------------------------------");

        // if you want to create 2D array, need to use 2 pairs of brackets [][]

        int[][] a2DArray = {
                {1,2,3},    // 1st 1D array (index 0)
                {4,5,6},    // 2nd 1D array (index 1)
                {7,8,9}     // 3rd 1D array (index 2)
        };

        // print 1st 1D array:
        System.out.println(Arrays.toString(a2DArray[0]));

        // print 5 from 2nd 1D array
        System.out.println(a2DArray[1][1]); // no .toString needed for single values
        System.out.println("---------------------------------------------");

        for (int i = 0; i < a2DArray.length; i++) {
            // 1st loop for getting each 1D array

            for (int j = 0; j < a2DArray[i].length; j++) {
                // 2nd loop for getting each element inside each 1D array

                System.out.print(a2DArray[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        for (int[] a1DArray : a2DArray) { // 1st loop for getting each 1D array

            for (int eachElement : a1DArray) {
                // 2nd loop for getting each element inside each 1D array

                System.out.print(eachElement + " ");
            }
        }
        System.out.println();


    }
}
