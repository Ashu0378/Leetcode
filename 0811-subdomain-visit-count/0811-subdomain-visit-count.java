class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String[] temp=cpdomains[i].split(" ");
            int num=Integer.parseInt(temp[0]);
            map.put(temp[1],map.getOrDefault(temp[1],0)+num);
            for(int j=0;j<temp[1].length();j++){
                char ch=temp[1].charAt(j);
                if(ch=='.'){
                    map.put(temp[1].substring(j+1),map.getOrDefault(temp[1].substring(j+1),0)+num);
                }
            }
            
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            res.add(entry.getValue() + " " + entry.getKey());
        }

        return res;
    }
}