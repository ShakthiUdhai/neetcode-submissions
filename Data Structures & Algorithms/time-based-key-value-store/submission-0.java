class TimeMap {

    Map<String,List<List<Object>>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.get(key)==null){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new ArrayList<>(Arrays.asList(value,timestamp)));
    }
    
    public String get(String key, int timestamp) {
        if(map.get(key)==null){
            return new String("");
        }
        String res="";
        int l=0,r=map.get(key).size()-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((int)map.get(key).get(mid).get(1)<=timestamp){
                l=mid+1;
                res=(String)map.get(key).get(mid).get(0);
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}
