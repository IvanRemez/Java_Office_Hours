package week12.evening.Task2;

public class Computer {

    public String OS;
    public int memory;

    public Computer(String OS, int memory) {
        this.OS = OS;
        this.memory = memory;
    }

    public void start(){
        System.out.println(OS + " is starting");
    }

    public void shutdown(){
        System.out.println(OS + " is shutting down");
    }

    public void info(){
        System.out.println("The Operating System is " + OS + ", the memory is " + memory + " GB");
    }
}
/*
Task 2 :

  Create a class called Computer

            instance variables:
                os, memory

                add a constructor to set all the fields

            instance methods:

                start(), shutdown() , info()

        Create the following sub classes of Computer:

            1. Mac:

                    extra methods:
                        openSiri()
                        openSafari()

            2. Asus:

                    extra methods:
                       openEdge()
 */