package ByteDance.DP;

public class StockSell {
    /**暴力*/
    /*public static int maxRevenue(int[] arr){
        int n = arr.length;
        int ans = 0;
        if(arr.length == 0){
            return 0;
        }
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int cur = arr[j]-arr[i];
                ans = Math.max(ans,cur);
            }
        }
        return ans;
    }*/
    public static int maxRevenue(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int n = arr.length;
        int[] maxRight = new int[arr.length];
        maxRight[n-1] = arr[n-1];
        int ans = 0;
        for(int i=n-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],arr[i]);
        }
        for(int i=0;i<n;i++){
            ans = Math.max(maxRight[i]-arr[i],ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxRevenue(a));
    }
}
