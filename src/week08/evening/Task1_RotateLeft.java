package week08.evening;

import java.util.Arrays;

public class Task1_RotateLeft {

    public static void main(String[] args) {

        int[] x = {1,2,3};           // = > [2,3,1]

        /*
        x[0] = x[1]; // assign 2nd element to 1st element
        x[1] = x[2]; // assign 3rd element to 2nd element
        x[2] = x[0]; // assign 1st element to 3rd element
        */

        int temp = x[0]; // don't want to lose data of 1st element, so we need to store
        // it in a temporary variable and reassign later 

        for (int i = 0; i < x.length - 1; i++) {

            x[i] = x[i+1]; // shifting elements over 1 spot to the left
        }
        x[x.length - 1] = temp; // temp element assigned to last index

        System.out.println(Arrays.toString(x));
        System.out.println("---------------------------------------------");


        int[] y = {17,12,10,8};      // = > [12,10,8,17]

        int temp1 = y[0]; // don't want to lose data of 1st element, so we need to store
        // it in a temporary variable and reassign later 

        for (int i = 0; i < y.length - 1; i++) {

            y[i] = y[i+1]; // shifting elements over 1 spot to the left
        }
        y[y.length - 1] = temp1; // temp element assigned to last indey

        System.out.println(Arrays.toString(y));
        System.out.println("---------------------------------------------");
        
        
        int[] a = {7,0,0};           // = > [0,0,7]

        int temp2 = a[0]; // don't want to lose data of 1st element, so we need to store
        // it in a temporary variable and reassign later

        for (int i = 0; i < a.length - 1; i++) {

            a[i] = a[i+1]; // shifting elements over 1 spot to the left
        }
        a[a.length - 1] = temp2; // temp element assigned to last indea

        System.out.println(Arrays.toString(a));


    }
}
/*
Task 1    : Write a program that accepts an array and prints an array with the elements
            "rotated left"

        int[] x = {1,2,3};           // = > [2,3,1]
        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]
 */