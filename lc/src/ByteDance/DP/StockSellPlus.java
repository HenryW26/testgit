package ByteDance.DP;

public class StockSellPlus {
    public int maxProfit(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int valley = arr[0];
        int peak = arr[0];
        int ans = 0;
        int n = arr.length;
        int i = 0;
        while (i<n-1){
            while(i<n-1&&arr[i+1]<=arr[i]){
                i++;
            }
            valley = arr[i];
            while(i<n-1&&arr[i+1]>=arr[i]){
                i++;
            }
            peak = arr[i];
            ans += peak-valley;
        }
        if(ans<=0){
            return 0;
        }
        else{
            return ans;
        }
    }
}
