class Solution {



    public String encode(List<String> strs) {

        StringBuilder encodedString = new StringBuilder();
        for(String str : strs){
            encodedString.append(str.length());
            encodedString.append("#");
            encodedString.append(str);
        }

        return encodedString.toString();

    }

    public List<String> decode(String str) {

        int i = 0;
        List<String> res = new ArrayList<>();
        

        while(i<str.length()){

            int j=i;
            StringBuilder singleString = new StringBuilder();

            while(str.charAt(j)!='#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            j++;
            i=j+length;

            singleString.append(str.substring(j,i));
            res.add(singleString.toString());
        }

        return res;

    }
}
