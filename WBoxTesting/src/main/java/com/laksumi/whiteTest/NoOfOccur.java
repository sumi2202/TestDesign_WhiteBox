package com.laksumi.whiteTest;

public class NoOfOccur {
    private static final int maxChar = 256;
    public static String checkOccur(String usrInput){
        int charContain[] = new int[maxChar];
        int strLength = usrInput.length();
        char chara[] = new char[usrInput.length()];
        StringBuilder result = new StringBuilder();


        for(int i =0; i < strLength; i++){
            charContain[usrInput.charAt(i)]++;
        }
        for(int i = 0; i < strLength; i++){
            chara[i] = usrInput.charAt(i);
            int search = 0;
            for(int j = 0; j <= i; j++){
                if(usrInput.charAt(i) == chara[j]){
                    search++;
                }
            }
            if(search == 1){
                result.append("\n# of occurrences for " + usrInput.charAt(i) + ": " + charContain[usrInput.charAt(i)]);
            }
        }
        return result.toString();
    }


}
