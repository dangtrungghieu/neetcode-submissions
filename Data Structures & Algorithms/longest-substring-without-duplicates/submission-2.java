class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Thu chuoi rong -> 0 || co khoang trang -> khong tinh khoang trang.
        HashSet <Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        
        for(int right = 0;right < s.length(); right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, right - left + 1);
        }


        return max;
    }
}
