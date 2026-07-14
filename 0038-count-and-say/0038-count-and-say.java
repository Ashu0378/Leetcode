class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int curr=s.length();
            int j=0;
            while(j<curr){
                char ch=s.charAt(j);
                int count=1;
                while(j+1<curr && ch==s.charAt(j+1)){
                    count++;
                    j++;
                }
                sb.append(count);
                sb.append(ch);
                j++;
            }
            s=sb.toString();
        }
        return s;
    }
}