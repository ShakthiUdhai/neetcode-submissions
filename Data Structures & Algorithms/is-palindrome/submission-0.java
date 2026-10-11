class Solution {
    public boolean isPalindrome(String s) {

        String al = s.replaceAll("[^a-zA-Z0-9]","");
        String ws = al.replaceAll("\\s+","");
        String ls = ws.toLowerCase();
        char[] chars = ls.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while(i<j){
            if(chars[i]!=chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
