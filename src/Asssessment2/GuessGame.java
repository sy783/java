package Asssessment2;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        int noOfTries = 0;

        int num = (int) (Math.random() * 100);
        System.out.println("random = " + num);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int guessedNo = myObj.nextInt();

        if(guessedNo == num){

            System.out.println("You guessed it correctly! \n");
            System.out.println("You won! \n");
            System.out.println("Total Number of Tries: 1\n");

        }
        else{

            while(guessedNo != num){ //while(true)

                if(guessedNo > num)
                {
                    System.out.println("You guessed it wrongly! \n");
                    System.out.println("Guess a smaller number. \n");

                    System.out.println("Guess the number: ");
                    guessedNo = myObj.nextInt();
                    noOfTries++;
                }
                else if (guessedNo < num){

                    System.out.println("You guessed it wrongly! \n");
                    System.out.println("Guess a bigger number. \n");

                    System.out.println("Guess the number: ");
                    guessedNo = myObj.nextInt();
                    noOfTries++;

                }
                else{

                    System.out.println("You guessed it correctly! \n");
                    System.out.println("You won! \n");
//                    System.out.println("Total Number of Tries:" + noOfTries);
                }


                if(guessedNo == num){

                    System.out.println("You guessed it correctly! \n");
                    System.out.println("You won! \n");
//                    System.out.println("Total Number of Tries:" + noOfTries);
//                    noOfTries++;
                }

                System.out.println("Total Number of Tries: " + noOfTries);
                noOfTries++;


            }
        }

        }

    }

