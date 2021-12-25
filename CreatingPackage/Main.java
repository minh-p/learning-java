// importing and running a class from a package

import greetings.greet;

public class Main {
    public static void main(String[] args) {
        greet greetObject = new greet();
        // this line is how you run a class from a package
        // every class must have a main method; for automatic running eeee
        // meaning that; somewhere; an already-made code; would say: "runningClass.main(args)"
        greetObject.main(args);
    }
}
