class Solution {
    public class Neighbour{
        String v;
        double w;
        Neighbour(String s,double w){
            this.v=s;
            this.w=w;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,List<Neighbour>> map=new HashMap<>();
        for(int i=0;i<values.length;i++){
            List<String> edge=equations.get(i);
            List<Neighbour> nbrs=map.getOrDefault(edge.get(0),new ArrayList<>());
            nbrs.add(new Neighbour(edge.get(1),values[i]));
            map.put(edge.get(0),nbrs);
            nbrs=map.getOrDefault(edge.get(1),new ArrayList<>());
            nbrs.add(new Neighbour(edge.get(0),1/values[i]));
            map.put(edge.get(1),nbrs);
        }
        double[] ans=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            List<String> st=queries.get(i);
            if(map.containsKey(st.get(0)) && map.containsKey(st.get(1))){
                ans[i]=helper(st.get(0),1.0,new HashSet<>(),st.get(1),map);
            }
            else{
                ans[i]=-1;
            }
        }
        return ans;
    }
    public double helper(String node,double ans,Set<String> vis,String target,Map<String,List<Neighbour>> adj){
        if(vis.contains(node)) return -1.0;
        if(node.equals(target)) return ans;
        vis.add(node);
        for(Neighbour nbr:adj.getOrDefault(node,new ArrayList<>())){
            double val=helper(nbr.v,ans*nbr.w,vis,target,adj);
            if(val!=-1) return val;
        }
        return -1.0;
    }
}