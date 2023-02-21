package week10.evening.statics;

public class TestEating {

    public static void main(String[] args) {

        EatCake Sergie = new EatCake();

        Sergie.eatCake(10);
        System.out.println(Sergie.totalSlicesOfCake); // 158

        EatCake Adam = new EatCake();

        Adam.eatCake(10);
        System.out.println(Adam.totalSlicesOfCake);
        // STILL 158 b/c total variable WAS NOT static -
        //      New Cake object created for each person
            // needs to be static = they are eating SAME cake
    }
}
