//public class DecimalComparator{
//
//    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
//        System.out.println(firstNum + " " + secondNum);
//
//        if (firstNum == 0 && secondNum == 0) {
//            return true;
//        } else if (firstNum == secondNum){
//            return true;
//        } else {
//            int no1 = (int)(firstNum*1000);
//            int no2 = (int)(secondNum*1000);
//            if (no1 == no2) {
//                return true;
//            }
//            return false;
//        }
//
//    };
//
//
//    public class EqualSumChecker {
//
//        public static boolean hasEqualSum(int no1, int no2, int no3){
//            if ((no1 + no2) == no3){
//                return true;
//            }
//            return false;
//        }
//
//    }
//
//
//    public class TeenNumberChecker {
//
//        public static boolean hasTeen(int no1, int no2, int no3){
//            if (isTeen(no1) || isTeen(no2) || isTeen(no3)){
//                return true;
//            }
//            return false;
//        }
//
//        public static boolean isTeen(int num){
//            if (num >= 13 && num <= 19 ){
//                return true;
//            }
//            return false;
//        }
//
//    }
//}