package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("El", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(900));
        displayHighScorePosition("Joe", calculateHighScorePosition(400));
        displayHighScorePosition("Sally", calculateHighScorePosition(50));
        displayHighScorePosition("Louise", calculateHighScorePosition(1000));
        displayHighScorePosition("Carol", calculateHighScorePosition(500));
        displayHighScorePosition("Frank", calculateHighScorePosition(100));
    }

    // need to declare type of incoming parameters
    // void means nothing is being returned
    // you can tell it to return a datatype instead, such as int below
    //a void method is also known as a procedure
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position
                + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
//        if (score >= 1000){
//            return 1;
//        } else if (score >= 500){
//            return 2;
//        } else if (score >= 100){
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4; //assuming position 4 will be returned
        if(score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }

        return position;
    }
}
