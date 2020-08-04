package ByteDance.Array;

public class Rains{
    /**Brute Force
     *
    public int trap(int[] height){
        int count=0;
        for(int i=0;i<height.length;i++){
            int maxLeft=0;
            int maxRight=0;
            for(int j=i;j>=0;j--){
                maxLeft=Math.max(maxLeft,height[j]);
            }
            for(int j=i;j<height.length;j++){
                maxRight=Math.max(maxRight,height[j]);
            }
            count+=Math.min(maxLeft,maxRight)-height[i];
        }
        return count;
    }
}*/

    /**dp*/
    public static int trap(int[] height){
        if (height == null) {
            return 0;
        }
        if(height.length==0){
            return 0;
        }
        int count=0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        maxLeft[0]=height[0];
        for(int i=1;i<height.length;i++){
            maxLeft[i]=Math.max(height[i],maxLeft[i-1]);
        }
        maxRight[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            maxRight[i]=Math.max(height[i],maxRight[i+1]);
        }
        for(int i=1;i<height.length-1;i++){
            count+=Math.min(maxLeft[i],maxRight[i])-height[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] height={};
        System.out.println(Rains.trap(height));
    }



//public class Rains {
//    public int trap(int[] height){
//        int count = 0;
//        int current =0;
//        while(current<height.length) {
//            int sum=0;
//            Pair pair=biggerHeightNext(current, height);
//            if (pair!=null) {
//                for(int i=current;i<pair.index;i++){
//                    sum+=height[i];
//                }
//                count += height[current]*(pair.index-current-1)-sum;
//                current=pair.index;
//            }
//            else{
//                current++;
//            }
//        }
//        return count;
//    }
//    public Pair biggerHeightNext(int cur, int[] height){
//        for(int i=cur;i<height.length;i++){
//            if(cur<=height[i]){
//                Pair pair = new Pair(i,height[i]);
//                return pair;
//            }
//        }
//        return null;
//    }
//    public static void main(String[] args) {
//        int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
//        Rains rain = new Rains();
//        System.out.println(rain.trap(height));
//    }
//}
//
//class Pair{
//    int index;
//    int height;
//    public Pair(int index,int height){
//        this.index=index;
//        this.height=height;
//    }
//}
}