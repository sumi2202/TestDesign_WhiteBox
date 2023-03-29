package com.laksumi.whiteTest;

public class NoOfOccur {
    private static final int maxChar = 256;
    static void checkOccur(String usrInput){
        int charContain[] = new int[maxChar];
        int strLength = usrInput.length();
        char chara[] = new char[usrInput.length()];

        for(int i =0; i < strLength; i++){
            charContain[usrInput.charAt(i)]++;
        }
        
    }



}
