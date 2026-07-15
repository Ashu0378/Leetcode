class Solution {
    public int longestPalindrome(String s) {
      if(s.length()==1) return 1;
      int[] freq=new int[52];  
      for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++; 
            } else if (c >= 'A' && c <= 'Z') {
                freq[c - 'A' + 26]++;
            }
       }
       int oddCount=0;
       int evenCount=0;
       for(int i=0;i<52;i++){
            if(freq[i]%2==0) evenCount+=freq[i];
            else{
                if(freq[i]==1) oddCount++;
                else if(freq[i]>1){
                    evenCount+=(freq[i]-1);
                    oddCount++;
                }
            }
        
        }
        if(oddCount!=0) evenCount++;
        return evenCount;
    }
    
}