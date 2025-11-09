class Solution {
    public int[] plusOne(int[] digits) {
        //
        int n= digits.length -1;
        for(int i = n; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            // Test Case: if array [9] ==> then 9 = 0
            digits[i]=0;
        }
        int newarr[] = new int[digits.length + 1];
        newarr[0] = 1;
        return newarr;
        
    }
}