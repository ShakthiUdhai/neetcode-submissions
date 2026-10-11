class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> subString = new HashSet<>();
        int j=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            while(subString.contains(s.charAt(i))){
                subString.remove(s.charAt(j));
                j++;
            }
            subString.add(s.charAt(i));
            res = Math.max(res,subString.size());
        }
        return res;
    }
}
