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
        for(int i = 0; i < strLength; i++){
            chara[i] = usrInput.charAt(i);
            int search = 0;
            for(int j = 0; j <= i; j++){
                if(usrInput.charAt(i) == chara[j]);
            }
            if(search == 1){
                System.out.println("# of occurrences for " + usrInput.charAt(i) + ": " + charContain[usrInput.charAt(i)]);
            }
        }
    }



}
