/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
import java.util.Scanner;
import java.lang.*;

public class Exercise17 {
    public static void main(String[] args){

        int choice = 0, alcohol = 0, weight = 0, hours = 0;
        String temp = "n";
        boolean check = false;
        double male = 0.73, female = 0.66;
        double BAC = 0;
        double legalBAC = 0.08;
        Scanner scnr = new Scanner(System.in);

        while(!check){
            System.out.println("Enter a 1 if you are a male or a 2 if you are female:");
            temp = scnr.next();

            if(checkNumericValue(temp) == true ){
                check = true;
                choice = Integer.parseInt(temp);
            }
        }

        check = false;
        while(!check){
            System.out.println("How many ounces of alcohol did you have?");
            temp = scnr.next();

            if(checkNumericValue(temp) == true ){
                check = true;
                alcohol = Integer.parseInt(temp);
            }
        }

        check = false;
        while(!check){
            System.out.println("What is your weight, in pounds?");
            temp = scnr.next();

            if(checkNumericValue(temp) == true ){
                check = true;
                weight = Integer.parseInt(temp);
            }
        }

        check = false;
        while(!check){
            System.out.println("How many hours has it been since your last drink?");
            temp = scnr.next();

            if(checkNumericValue(temp) == true ){
                check = true;
                hours = Integer.parseInt(temp);
            }
        }


        if(choice == 1){
            BAC = (alcohol * 5.14 / weight * male) - .015 * hours;
        }
        else if (choice == 2)
        {
            BAC = (alcohol * 5.14 / weight * female) - .015 * hours;
        }

        System.out.printf("Your BAC is %.6f \n", BAC);

        if(BAC >= legalBAC){
            System.out.println("It is not legal for you to drive.");
        }
        else{
            System.out.println("It is legal for you to drive.");
        }

        scnr.close();
        System.exit(0);
    }//end of main

    public static boolean checkNumericValue(String value){

        for(int i = 0; i < value.length(); i++){
            if(!Character.isDigit(value.charAt(i))){
                return false;
            }
        }
        return true;

    }//end of main//

}//end of program//

