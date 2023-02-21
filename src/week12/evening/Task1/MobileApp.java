package week12.evening.Task1;

public class MobileApp {

    public String name;
    public double version;

    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void useTheApp(int minutes){
        System.out.println("You are using " + name + " for " + minutes + " minutes");
    }

    public void download(){
        System.out.println("You are downloading " + name + " version: " + version);
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
/*
Task 1 :

 Create a class called MobileApp

            instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)
 */