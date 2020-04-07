public class DigitSumChallenge {

    public static void main(String[] args){
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(15));
    }

    public static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number != 0){
          sum += number % 10;
          number /= 10;
        }

        return sum;
    };
}


