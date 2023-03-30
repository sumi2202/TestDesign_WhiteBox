/*
* Laksumi Somaskanthamoorthy
* 100782723
*
* */
package com.laksumi.whiteTest;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //initializes Scanner object for user input
        Scanner input = new Scanner(System.in);
        String usrInput;

        //allows user to input string
        System.out.print( "Enter anything to start search: ");
        usrInput = input.nextLine();

        //refers to NoOfOccur class and calls the checkOccur Method
        System.out.println("Printing # of occurrences:\n" + NoOfOccur.checkOccur(usrInput));
    }
}
