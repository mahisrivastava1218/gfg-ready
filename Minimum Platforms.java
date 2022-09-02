lass Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat=1;
        int res=1;
        int i=1;
        int j=0;
        
        
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat++;
                i++;
            }else if(arr[i]>dep[j]){
                plat--;
                j++;
            }if(plat>res){
                     res=plat;
            }
            
        }
        
        return res;
        
    }
    
}

