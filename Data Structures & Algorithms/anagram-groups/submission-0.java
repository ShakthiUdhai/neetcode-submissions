class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> res = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(res.containsKey(sortedString)){
                res.get(sortedString).add(str);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                res.put(sortedString,temp);
            }
        }

        return new ArrayList<>(res.values());
        

        
    }
}
