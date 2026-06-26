class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0 || j>=0 || carry==1){
            int x=(i>=0)?a.charAt(i)-'0':0;
            int y=(j>=0)?b.charAt(j)-'0':0;
            int sum=x+y+carry;
            if(sum==0 || sum==2){
                ans.append('0');
            }
            else{
                ans.append('1');
            }
            carry=sum/2;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}