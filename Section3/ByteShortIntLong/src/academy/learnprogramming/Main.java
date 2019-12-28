package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("int min: "+ myMinIntValue);
        System.out.println("int max: "+ myMaxIntValue);
        System.out.println("Busted max: " +( myMaxIntValue + 1));
        System.out.println("Busted min: " +( myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte min: "+ myMinByteValue);
        System.out.println("byte max: "+ myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min: "+ myMinShortValue);
        System.out.println("Short max: "+ myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min: "+ myMinLongValue);
        System.out.println("Long max: "+ myMaxLongValue);
        long bigLongLiteralValue = 2_146_483_647_284L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);

        byte challengeByte = 5;
        short challengeShort = 50;
        int challengeInt = 500;
        long challengeLong = 50000L + 10 * (challengeByte + challengeShort + challengeInt);
        System.out.println(challengeLong);

        short shortTotal = (short)(1000 + 10 * (challengeByte + challengeShort + challengeInt));
        System.out.println(shortTotal);
    }
}
