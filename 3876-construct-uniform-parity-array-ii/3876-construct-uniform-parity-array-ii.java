class Solution {
    public boolean uniformArray(int[] nums1){
        int minVal=Integer.MAX_VALUE;
        boolean hasOdd=false;
        for (int num:nums1) {
            if (num<minVal) {
                minVal=num;
            }
            if ((num&1)!=0) {
                hasOdd=true;
            }
        }
        if (!hasOdd){
            return true;
        }
        return (minVal&1)!=0;
    }
}