import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           // determines length of firstArray
        int a1 = nums1.length;
        
        // determines length of secondArray
        int b1 = nums2.length;
        
        // resultant array size
        int c1 = a1 + b1;
  
        // create the resultant array
        int[] arr = new int[c1];
  
        // using the pre-defined function arraycopy
        System.arraycopy(nums1, 0, arr, 0, a1);
        System.arraycopy(nums2, 0, arr, a1, b1);
        double med;
        Arrays.sort(arr);
        if(arr.length%2==0){
        med= (double)((arr[arr.length/2]) +arr[(arr.length/2)-1])/2;
    }
    else{
         med= (double)arr[arr.length/2];

    }
    return med;

}
}
