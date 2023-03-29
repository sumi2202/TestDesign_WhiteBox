package com.laksumi.whiteTest;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String usrInput;

        System.out.print( "Enter a word to start search: ");
        usrInput = input.nextLine();

        NoOfOccur.checkOccur(usrInput);
    }
}
