class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int ma = m-1;
         int na = n-1;
         int right = m+n-1;

         while(na>=0){
            if(ma>=0 && nums1[ma] > nums2[na]){
                nums1[right]=nums1[ma];
                ma--;
            } else{
                nums1[right]=nums2[na];
                na--;
            }
            right--;
         }
    }
}
