class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        char temp=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2!=0) temp=(char)(i+'a');
            int num=freq[i]/2;
            while(num>0){
                sb.append((char)(i+'a'));
                num--;
            }
        }
        StringBuilder sb2=new StringBuilder(sb);
        if(temp!=0){
            sb.append(temp);

        }
        sb2.append(new StringBuilder(sb).reverse());
        return sb2.toString();

    }
}