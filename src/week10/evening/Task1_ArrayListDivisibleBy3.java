package week10.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_ArrayListDivisibleBy3 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 8, 9));
        
        ArrayList<Integer> result = findNumsDivBy3(nums);
        // Create Method shortcut:
            // Option + Return

        System.out.println(result); // nums div by 3: [3, 6, 9]

    }

    public static ArrayList<Integer> findNumsDivBy3(ArrayList<Integer> nums) {

        ArrayList<Integer> result = new ArrayList<>();

        // We need to check each num 1 by 1:
        for (Integer each : nums) {

            // we need to check if each num is divisible by 3
            if (each % 3 == 0){

                // if yes, put it inside the new ArrayList result
                result.add(each);
            }
        }
        // return result

        return result;
    }
}
   /*
Task 1 :
Create a method that which is get array list as a parameter then return the numbers
which are divisible by 3.
input:
  numbers : 2,3,4,5,6,8,9
output:
3,6,9
     */