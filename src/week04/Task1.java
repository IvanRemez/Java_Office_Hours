package week04_review;

public class Task1 {

    public static void main(String[] args) {

        int num = 30;
        String result = "";

        if (num > 0) {

            if (num % 2 == 0) {
                result += "Codility";
            } else if (num % 3 == 0) {
                result += "Test";
            } else if (num % 5 == 0) {
                result += "Coders";
            }

        } else {
            System.out.println("Invalid Number");
        }

        System.out.println(result);

    }
}
/*
  Task 1:
  Write a function:
			that, given a positive integer N  However, any number divisible by 2, 3 or 5
			should be replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

			- If a number is divisible by more than one of the numbers:2,3 or 5, it should
			be replaced by a concatenation of the respective words Codility, Test and Coders
			in this given order.

				    			EXPECTED

				    	numbers divisible by both 2 and 3 should be replacée by CodilityTest
				    	INPUT : 6    OUTPUT :  CodilityTest

				    	numbers divisible by allthree numbers: 2,3 and 5, should be replaced
				    	by CodilityTestCoders.
				    	INPUT : 30    OUTPUT :  CodilityTestCoders
 */