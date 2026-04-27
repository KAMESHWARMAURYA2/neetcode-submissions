class Solution {
    public boolean validPalindrome(String s) {
        
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            if(ch[left] != ch[right]) {
                return isPalindrom(ch, left+1, right) || isPalindrom(ch, left, right-1);
            }
            left++;
            right--;
        }
      return true;
    }

            public boolean isPalindrom(char[] ch, int left, int right) {
            while(left < right) {
                if(ch[left] != ch[right]){
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
}