class Solution {
    public class Pair{
        String s;
        int val;
        Pair(String s,int val){
            this.s=s;
            this.val=val;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord.equals(endWord)) return 0;
        Set<String> set=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while(q.size()>0){
            Pair p=q.poll();
            String str=p.s;
            int num=p.val;
            if(str.equals(endWord)) return num;
            char[] arr=str.toCharArray();
            for(int i=0;i<str.length();i++){                
                char orig=arr[i];
                for(char ch='a';ch<='z';ch++){
                    if(ch==orig) continue;
                    arr[i]=ch;
                    String temp=new String(arr);
                    if(set.contains(temp)){
                        q.add(new Pair(temp,num+1));
                        set.remove(temp);
                    }
                }
                arr[i]=orig;
            }
        }
        return 0;
    }
}