package week12.evening.Task1;

public class Discord extends MobileApp{

    public Discord(double version) {
        super("Discord", version);
    }

    public void chat(String name){
        System.out.println("I am chatting with: " + name);
    }

}
