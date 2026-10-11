class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] char1 = new int[26];
        int [] char2 = new int[26];

        if(s1.length()>s2.length()){
            return false;
        }

        for(int i=0;i<s1.length();i++){
            char1[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<s1.length();j++){
            char2[s2.charAt(j)-'a']++;
        }
        if(Arrays.equals(char1,char2)){
            return true;
        }
        int l=0;
        int r=s1.length()-1;
        while(r+1<s2.length()){
            r++;
            char2[s2.charAt(r)-'a']++;
            char2[s2.charAt(l)-'a']--;
            l++;
            if(Arrays.equals(char1,char2)){
                return true;
            }
        }
        return false;

    }
}
