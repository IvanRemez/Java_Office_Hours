package week12.evening.Task2;

public class Mac extends Computer{

    public Mac(int memory) {
        super("Mac OS", memory);
    }

    public void openSiri(){
        System.out.println("Siri is opening on Mac");
    }

    public void openSafari(){
        System.out.println("Safari is specific to Mac user which is opening");
    }

}
