package ss8.tennis_game;

import java.util.Scanner;

public class Tennisgame {
   private static String display = "";
public static final int ONE=1;
public static final int TWO=2;
public static final int THREE=3;
public static final int FOUR=4;

   public static String IsWin(int pointscore1,int pointscore2) {
        int minusResult = pointscore1 - pointscore2;
        if (minusResult == ONE) display = "Advantage player1";
        else if (minusResult == -1) display = "Advantage player2";
        else if (minusResult >= TWO) display = "Win for player1";
        else display = "Win for player2";
        return display;
    }

    public static String Isdraw(int pointscore1,int pointscore2) {
        switch (pointscore1) {
            case 0:
                display = "Love-All";
                break;
            case 1:
                display = "Fifteen-All";
                break;
            case 2:
                display = "Thirty-All";
                break;
            case 3:
                display = "Forty-All";
                break;
            default:
                display = "Deuce";
                break;
        }
        return display;
    }

   public static String isTheCurrentScore(int pointscore1,int pointscore2) {

       int tempScore;
       System.out.println("Điểm số hiện tại của 2 người chơi");
        for (int i = ONE; i < THREE; i++) {
            if (i == ONE) {
                display += "player1:";
                tempScore=pointscore1;
            }
            else {
                display += "-";
                tempScore=pointscore2;
                display+="player2:";
            }
            switch (tempScore) {
                case 0:
                    display += "Love";
                    break;
                case 1:
                    display += "Fifteen";
                    break;
                case 2:
                    display += "Thirty";
                    break;
                case 3:
                    display += "Forty";
                    break;
            }
        }
        return display;
    }

    public static String getScore(int pointscore1, int pointscore2) {
        String result;
        if (pointscore1 == pointscore2) {
            result = Isdraw(pointscore1,pointscore2);
        } else if (pointscore1 >= FOUR || pointscore2 >= FOUR) {
            result = IsWin(pointscore1,pointscore2);
        } else {
            result = isTheCurrentScore(pointscore1,pointscore2);
        }
        return result;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Nhập điểm người chơi 1");
       int pointscore1=Integer.parseInt(sc.nextLine());
       System.out.println("Nhập điểm người chơi 2");
       int pointscore2=Integer.parseInt(sc.nextLine());
        System.out.println(getScore(pointscore1, pointscore2));
    }

}




