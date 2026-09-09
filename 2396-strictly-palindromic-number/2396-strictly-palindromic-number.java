class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            int temp=n;
            String d="";
            while(temp>0){
                int r=temp%i;
                d+=r;
                temp/=i;
            }
            String rev=new StringBuilder(d).reverse().toString();
            if(!d.equals(rev)) return false;
        }
        return true;
    }
}