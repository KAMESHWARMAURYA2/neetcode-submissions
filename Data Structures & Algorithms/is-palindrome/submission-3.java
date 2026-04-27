class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replace(" ", "")
        .replace("?", "")
        .replace("!", "")
        .replace("@", "")
        .replace("$", "")
        .replace(",", "")
        .replace("'", "")
        .replace(".", "")
        .replace(":", "")
        .replace(";", "")
        .toLowerCase();

        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        while(left < right) {
            if(ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
