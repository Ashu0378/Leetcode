class Solution {
    int maxScore;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        maxScore=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char l:letters){
            map.put(l,map.getOrDefault(l,0)+1);
        }

        helper(words,map,score,0,0);
        return maxScore;

    }
    public void helper(String[] words,Map<Character,Integer> map,int[] score,int index,int curr){
        maxScore=Math.max(curr,maxScore);

        if(index==words.length) return;

        for(int i=index;i<words.length;i++){
            Map<Character, Integer> temp = new HashMap<>(map);
            String word=words[i];
            int wordScore=0;
            boolean isValid=true;
            for(char ch:word.toCharArray()){
                if(temp.getOrDefault(ch,0)>0){
                    temp.put(ch,temp.get(ch)-1);
                    wordScore+=score[ch-'a'];
                }
                else{
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                helper(words,temp,score,i+1,curr+wordScore);
            }
        }
    }
}