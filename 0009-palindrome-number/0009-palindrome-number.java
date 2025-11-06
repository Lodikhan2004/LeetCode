class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int rev=0;
        while(x > 0){
            int lastdig = x % 10;
            rev =rev * 10 + lastdig;
            x = x/10;
        }
        if( original != rev){
            return false;
        }
        return true;
    }
}