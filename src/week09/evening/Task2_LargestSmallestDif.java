package week09.evening;

import java.util.Arrays;

public class Task2_LargestSmallestDif {

    public static int findDifferenceBetweenMaxAndMinInArray(int[] array){

        int max= 0,
                min = 0;

        Arrays.sort(array);
        max = array[array.length - 1];
        min = array[0];

        return max - min;

    }

    public static void main(String[] args) {

        int[] x = {10,3,5,6};

        int result = findDifferenceBetweenMaxAndMinInArray(x);

        System.out.println("result = " + result);

    }
}
/*
2.Write a method that accepts an array and print the difference between the largest and
smallest values in the array.

int[] x = {10,3,5,6} = > 7
int[] y = {7,2,10,9} = > 8
int[] z = {2,10,7,2} = > 8
 */