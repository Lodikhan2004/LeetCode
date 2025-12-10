class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int rp = n-1;
        for(int lp=0; lp< n/2; lp++){
            char temp = s[lp];
            s[lp] = s[rp];
            s[rp] = temp;
            rp--;
        }
    }
}