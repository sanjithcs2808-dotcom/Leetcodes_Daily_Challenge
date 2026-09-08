class Solution {
    public int countCommas(int n) {
        int c=0;
        // for(int i =0; i<=n;i++){
        //     if(i>999)
        //         c++;
        // }
        if(n>=1000){
            return (n-1000)+1;
        }
        return 0;
    }
}