class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> num = new Stack<>();
        String ans = "";
        
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                num.push(k);
                k = 0;
                st.push(ch);
            } else if (ch == ']') {
                String str = "";
                while (st.peek() != '[') {
                    str = st.pop() + str;
                }
                st.pop();
                
                int repeatTimes = num.pop();
                String repeatedStr = "";
                for (int j = 0; j < repeatTimes; j++) {
                    repeatedStr += str;
                }
                
                if (st.isEmpty()) {
                    ans += repeatedStr;
                } else {
                    for (int j = 0; j < repeatedStr.length(); j++) {
                        st.push(repeatedStr.charAt(j));
                    }
                }
            } else {
                if (st.isEmpty()) {
                    ans += ch;
                } else {
                    st.push(ch);
                }
            }
        }
        return ans;
    }
}