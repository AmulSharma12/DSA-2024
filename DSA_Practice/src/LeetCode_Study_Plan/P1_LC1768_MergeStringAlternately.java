package LeetCode_Study_Plan;

public class P1_LC1768_MergeStringAlternately {
    public static void main(String[] args){
        System.out.println(mergeAlternately("abc", "pqr"));
    }


    private static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int i = 0,j = 0;
        boolean isWord1 = true;     //first letter is word1


        //when there is letter in both the string word1 & word2
        while(i < word1Length && j < word2Length){
            if(isWord1){
                mergedString.append(word1.charAt(i++));
                isWord1 = false;    //if run for word1 then it turn to word2 vice versa
            }else{
                mergedString.append(word2.charAt(j++));
                isWord1 = true;
            }
        }

        //for remaining letters if exist in both the string
        while(i < word1Length){
            mergedString.append(word1.charAt(i++));
        }

        while(j < word2Length){
            mergedString.append(word2.charAt(j++));
        }

        return mergedString.toString();
    }
}
