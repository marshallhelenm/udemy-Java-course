package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// floating point numbers are also known as 'real' numbers
        //Single and Double Precision - 32 and 64 bits

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min: " + myMinFloatValue);
        System.out.println("Float max: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min: " + myMinDoubleValue);
        System.out.println("Double max: " + myMaxDoubleValue);


        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5.00 / 2d; //double data type is accepted by default much like int is for whole nums but you can add 'd' to the end for clarity

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
    }
}
