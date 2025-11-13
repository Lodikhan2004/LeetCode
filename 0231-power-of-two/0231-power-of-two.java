class Solution {
    public boolean isPowerOfTwo(int n) {
        // Here a property lies if you take & of n and n-1 ie in binary ans is always 0 
        if(n <= 0){
            return false;
        }
        int bitmask = n & (n-1);
        if(bitmask == 0){
            return true;
        }
        return false;
    }
}