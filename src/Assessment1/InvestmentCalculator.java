package Assessment1;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String[] args) {


            int investmentAmount;

            int year = 2023;
            int profit = 0;
            int inputYear = 0;
            int profitPercentage = 0;


            Scanner input = new Scanner(System.in);
            System.out.println("Please enter amount of investment: ");
            investmentAmount = input.nextInt();
            System.out.println("Please enter average profit percentage: ");
            profitPercentage = input.nextInt();
            System.out.println("Please enter year: ");
            inputYear = input.nextInt();

            int duration = year + inputYear;

            do {


                    profit = investmentAmount/profitPercentage;

                    System.out.println("Year : " + year);
                    System.out.println("Investment Amount : " + investmentAmount);
                    System.out.println("Profit : " + profit);

                    investmentAmount += profit;

                    year++;



            }while(year <= duration);


        }






    }
