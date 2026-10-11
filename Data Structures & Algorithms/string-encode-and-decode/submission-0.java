class Solution {

    StringBuffer encodedStr= new StringBuffer();

    public String encode(List<String> strs) {

        for(String str : strs){
            encodedStr.append(str);
            encodedStr.append("-");
        }

        return encodedStr.toString();

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        char[] charArray = str.toCharArray();
        StringBuffer singleStr = new StringBuffer();
        for(char c : charArray){
            if(c=='-'){
                res.add(singleStr.toString());
                singleStr.delete(0,singleStr.length());
            }
            else{
                singleStr.append(c);
            }
        }

        return res;

    }
}
