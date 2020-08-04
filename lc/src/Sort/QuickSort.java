package Sort;

public class QuickSort {
    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int pivot = arr[left];
        int l = left;
        int r = right;
        while(l<r){
            while(l<r&&arr[r] >= pivot){
                r--;
            }
            if(l<r) {
                arr[l] = arr[r];
            }
            while(l<r&&arr[l] <= pivot){
                l++;
            }
            if(l<r) {
                arr[r] = arr[l];
            }
        }
        arr[l] = pivot;
        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);
    }

    public static void main(String[] args) {
        int[] a ={3,10,5,7,4,2};
        quickSort(a,0,a.length-1);
        for(int i:a){
            System.out.println(i);
        }
    }

}
