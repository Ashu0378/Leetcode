class Solution {
    public String simplifyPath(String path) {
        // StringBuilder sb=new StringBuilder();
        // sb.append(path);
        // int i=path.length()-1;
        // while(i>=0){
        //     int countSlash=0;
        //     int countDot=0;
        //     if(sb.charAt(i)=='/'){
        //         int j=i;
        //         while(j>=0 && sb.charAt(j)!='/'){
        //             countSlash++;
        //             j--;
        //         }
        //     }
        //     if(countSlash==1 && i==sb.length()-1 && i!=0){
        //         sb.deleteCharAt(i);
        //     }
        //     else if(countSlash>1){
        //         while(countSlash>1){
        //             sb.deleteCharAt(i);
        //             i--;
        //         }
        //     }
        //     if(sb.charAt(i)=='.'){
        //         int j=i;
        //         while(j>=0 && sb.charAt(j)!='.'){
        //             countDot++;
        //             j--;
        //         }
        //     }
        //     if(countDot==2){
        //         int tempSlash=2;
        //         while(i>0 && tempSlash>=0){
        //             sb.deleteCharAt(i);
        //             i--;
        //         }
        //     }
        //     if(countDot==1){
        //         sb.deleteCharAt(i);
        //     }
        //     i--;
        // }
        // return new String(sb.toString());
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            } 
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(part);
            }
        }

        return "/" + String.join("/", stack);
    }
}