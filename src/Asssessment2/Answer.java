package Asssessment2;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {

        int rand = (int) (Math.random() * 100);
        System.out.println("random = " + rand);
        int noTrial = 0;

        while(true){

            Scanner myObj = new Scanner(System.in);
            System.out.println("Guess the number: ");
            int guessedNo = myObj.nextInt();

            if(guessedNo == rand){
                System.out.println("You win");
                System.out.println("Do you want to play more (Y/N)");
                String answer = myObj.next();

                if(answer.equals("N")){
                    break;
                } else{
                    rand = (int) (Math.random() * 100);
                    System.out.println("random = " + rand);
                    noTrial = 0;
                }
            }
            else{

                if(guessedNo > rand){
                    System.out.println("Guess higher");
                }
                else{
                    System.out.println("Guess lower");
                }
            }
        }
    }
}
