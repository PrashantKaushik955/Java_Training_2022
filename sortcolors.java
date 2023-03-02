class Solution {
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(mid,left,nums);
                mid++;
                left++;
            }else if(nums[mid]== 1){
                mid++;
            }else{
                swap(mid,right,nums);
                right--;
            }
        }
    
    }
    public static void swap(int i,int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String[] args) {
        int nums [] = {2,0,2,1,0,2,0,2};
        sortColors(2);
        System.out.println(nums + ";");
    
    }
}