class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        
        Arrays.sort(arr);
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum<K){
                sum += arr[i];
                
                count++;
            }
            if(sum>K){
                count--;
                break;
            }
        }
        return count;
    }
}
