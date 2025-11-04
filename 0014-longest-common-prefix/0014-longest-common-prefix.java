class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        //sort the strs array 
        Arrays.sort(strs);
        // store first and last String in char array for comparison
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length -1].toCharArray();
        //Compare first and last 
        for(int i=0; i< first.length; i++){
            // if first[i] is not equal to last[i] then break else: add char to prefix
            if(first[i] != last[i]){
                break;
            }
            prefix.append(first[i]);
        }
        return prefix.toString();     
    }
}