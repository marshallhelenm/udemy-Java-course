package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//
//        //if thens:
//	boolean isAlien = false;
//	if (isAlien == false) {
//        System.out.println("It is not an alien!");
//        System.out.println("And I am scared of aliens");
//    }
//
//	int topScore = 100;
//	if (topScore != 100){
//        System.out.println("You got the high score!");
//    }
//    //so far this is very much the same as Javascript, so I've stopped taking notes for the moment.
//
//
//        // ternary operator:
//        boolean isCar = false;
//        isCar = true;
//	boolean wasCar = isCar ? true : false;
//        if (wasCar) {
//            System.out.println("wasCar is true");
//        }
//        //looks like ternaries work just like i've learned elsewhere

    //Operator Challenge:
        double myDouble = 20.00;
        double otherDouble = 80.00;
        double result = ((myDouble + otherDouble) * 100.00) % 40.00;
        boolean myBool = (result == 0) ? true : false;
        System.out.println("myBool = " + myBool);
        if (!myBool){
            System.out.println("Got some remainder");
        };
    }
}
