package com.laksumi.whiteTest;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String usrInput;


        System.out.print( "Enter anything to start search: ");
        usrInput = input.nextLine();

        System.out.println("Printing # of occurrences:\n" + NoOfOccur.checkOccur(usrInput));
    }
}
