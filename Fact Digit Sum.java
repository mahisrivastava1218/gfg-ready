class Solution
{
    ArrayList<Integer> FactDigit(int N)
    {
        ArrayList<Integer> res=new ArrayList();
        int[] fact=new int[10];
        fact[0]=1;
        
        for(int i=1;i<10;i++){
            fact[i]=fact[i-1]*i;
        }
        for(int i=9;i>=1;i--){
            while(N>=fact[i]){
                N-=fact[i];
                res.add(i);
            }
        }
        Collections.reverse(res);
        return res;
        // code here
    }
}
