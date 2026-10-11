class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<position.length;i++){
            map.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        for(int i=0;i<position.length/2;i++){
            int temp = position[i];
            position[i] = position[position.length-i-1];
            position[position.length-i-1] = temp;
        }
        for(int i=0;i<position.length;i++){
            double time =(double) (target-position[i])/map.get(position[i]);
            if(stack.empty()){
                stack.push(time);
            }
            else if(stack.peek()>=time){
                continue;
            }
            else{
                stack.push(time);
            }
        }
        return stack.size();
    }
}
