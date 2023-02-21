package week10.evening.statics;

public class EatCake {

    public static int totalSlicesOfCake = 168;

    public void eatCake(int slice){

        totalSlicesOfCake -= slice;
        // when you eat slice, it subtracts slice from Total
    }

}
