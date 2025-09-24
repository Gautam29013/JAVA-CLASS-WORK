public class MergeSort {
    public static void conquer(int arr[] , int si , int mid , int ei) {
        int merged[] = new int[ei -si + 1];  

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei) {

        }

    }
    public static void divide(int arr[] , int si , int ei) {
        if(si >= ei) {
            return; 
        }

        mid = si + (ei -si)/2;
        divide(arr, si, mid);
        divide(arr , mid+1 , ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
            int arr[] = {6,3,9,5,2,8};
            int n = arr.length;
    }
}
