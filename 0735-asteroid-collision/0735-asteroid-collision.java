class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int x:asteroids){
            boolean alive=true;
            while(alive && !st.isEmpty() && st.peek()>0 && x<0){
                if(st.peek()<-x){
                    st.pop();
                }
                else if(st.peek()==-x){
                    st.pop();
                    alive=false;
                }
                else{
                    alive=false;
                }
            }
            if(alive){
                st.push(x);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}