class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean flag=true;
        int ans=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                    if(allowed.indexOf(ch)==-1){
                        flag=false;
                        break;
                    }
                    else{
                        flag=true;
                    }
                }
            
            if(flag) ans++;
        }
        return ans;
    }
}