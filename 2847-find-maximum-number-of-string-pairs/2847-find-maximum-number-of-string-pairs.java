class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0; i< words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            String rev = sb.reverse().toString();
            for(int j=i+1; j< words.length; j++){
                if(rev.equals( words[j])){
                    count++;
                }
            }
            
        }
        return count;
    }
}