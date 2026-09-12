class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int up = 0;
        int downl = 0;
        while(up < word1.length() || downl < word2.length()){
            if(up < word1.length()){
                result += word1.charAt(up);
                up++;
            }
            if( downl < word2.length()){
                result += word2.charAt(downl);
                downl++;
            }
        }
        return result.toString();
    }
}