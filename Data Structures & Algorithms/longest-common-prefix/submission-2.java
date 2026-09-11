class Solution {
    public String longestCommonPrefix(String[] strs) {
        String goat = strs[0];
        for(int i = 0;i < goat.length();i++){
            char c = goat.charAt(i);
            for(int j = 1;j < strs.length;j++){
                if( i >= strs[j].length() || strs[j].charAt(i) != c){
                    return goat.substring(0,i);
                }
            }
        }
        return goat;
    }
}