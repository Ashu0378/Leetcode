class Solution {
    public int minimumSum(int num) {
        int[] arr=new int[4];
        int i=0;
        while(num>0){
            int temp=num%10;
            arr[i++]=temp;
            num/=10;
        }
        Arrays.sort(arr);
        if(arr[0]==0 && arr[1]==0 && arr[2]==0) return arr[3];
        else if(arr[0]==0 && arr[1]==0) return arr[2]+arr[3];
        else if(arr[0]==0) return (arr[1]*10)+arr[2]+arr[3];
    
        return ((arr[0]*10)+arr[3])+((arr[1]*10)+arr[2]);
        

    }
}