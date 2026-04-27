class Solution {
    public boolean isAnagram(String s, String t) {
       
       if(s.length() != t.length()) {
        return false;
       }

       int[] freq = new int[26];
       for(int index=0; index < s.length(); index++) {
           freq[s.charAt(index) - 'a']++;
           freq[t.charAt(index) - 'a']--;
       }

       for(int f : freq) {
        if(f != 0) {
            return false;
        }
       }

       return true;
    }
}
