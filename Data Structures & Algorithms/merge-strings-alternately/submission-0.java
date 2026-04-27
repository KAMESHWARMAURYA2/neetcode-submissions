class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int pointer1 = 0;
        int pointer2 = 0;
        StringBuilder result = new StringBuilder();

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        while(word1.length() > pointer1 && word2.length() > pointer2) {
           result.append(ch1[pointer1]);
           result.append(ch2[pointer2]);
           pointer1++;
           pointer2++;
        }

        while(word1.length() > pointer1) {
            result.append(ch1[pointer1]);
            pointer1++;
        }

        while(word2.length() > pointer2) {
           result.append(ch2[pointer2]);
           pointer2++; 
        }

        return result.toString();

    }
}