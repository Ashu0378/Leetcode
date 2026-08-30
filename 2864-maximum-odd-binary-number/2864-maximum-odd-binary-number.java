class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onesCount = 0;
        for(char c:s.toCharArray()) {
            if (c=='1') onesCount++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< onesCount-1;i++) {
            sb.append('1');
        }
        for(int i=0;i<s.length()-onesCount;i++) {
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}