package week10.evening;

import java.util.ArrayList;

public class Task3_AddUniques {

    public static void main(String[] args) {

// if you know size of final array -> Use Arrays = faster
        // if you don't know -> Use ArrayList

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {4, 5, 6};

        ArrayList<Integer> result = getUniqueElements(first,second);

        System.out.println(result); // [1,2,3,4,5]
    }

    public static ArrayList<Integer> getUniqueElements(int[] first, int[] second) {

        // 1. Create NEW empty ArrayList:
        ArrayList<Integer> result = new ArrayList<>();

        // 2. Need to put first Array elements into NEW list:
        for (int eachNum : first) {

            if ( ! result.contains(eachNum)){
                // 3. Need to check if NEW ArrayList already contains my element

            // if (result.contains(eachNum)){
            //    continue;    // Alt Solution

                // 4. If not, add to NEW ArrayList
                result.add(eachNum);
            }
        }
        // 5. Need to put second Array elements into NEW list:
        for (int eachNum : second) {

            if (!result.contains(eachNum)){
                // 6. Need to check if NEW ArrayList already contains my element

                // 7. If not, add to NEW ArrayList
                result.add(eachNum);
            }
        }
        return result;
    }
}
    /*
    Task 3 :
Create a method that get two arrays as a parameters then return the numbers(ArrayList)
which has contains unique
elements in it.
first array :1,2,3,4,5
second array :4,5,6
output:
1,2,3,4,5,6
     */