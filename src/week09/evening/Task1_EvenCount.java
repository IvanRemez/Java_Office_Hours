package week09.evening;

public class Task1_EvenCount {

    public static int findNumOfEvenNumbersInArray(int[] array){

        int evenCount = 0;

        for (int each : array) {
            if (each % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }

        public static void main(String[] args) {

        int[] x = {2,1,2,3,4};

        int evenCount = 0;

        int result = findNumOfEvenNumbersInArray(x);

            System.out.println("result = " + result);


    }
}
/*
1. Write a method that accepts an array and prints the number of even numbers
in the array.

    int[] x = {2,1,2,3,4} = > 3
    int[] y = {2,2,0} = > 3
    int[] z = {1,3,5} = > 0
 */