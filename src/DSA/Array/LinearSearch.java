package DSA.Array;

public class LinearSearch {
    public int linearSearch(int nums[], int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target)return i;
        }
        return -1;
    }

    public int largestElement(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > ans)ans = nums[i];
        }
        return ans;
    }

    public int secondLargestElement(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2 && nums[i] < max1){
                max2 = nums[i];
            }
        }
        if(max2 == Integer.MIN_VALUE)return -1;
        return max2;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1)count++;
            if(nums[i] == 0){
                ans = Math.max(count, ans);
                count = 0;
            }
        }
        ans = Math.max(count ,ans);
        return ans;
    }

    public void rotateArrayByOne(int[] nums) {
        int a = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = a;
    }

    public void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int arr1[] = new int[k];
        for(int i=0;i<k;i++){
            arr1[i] = nums[i];
        }
        int a = k;
        int i = 0;
        for(i=0;i<nums.length-k;i++){
            nums[i] = nums[a];
            a++;
        }
        int j = 0;
        while(i < nums.length){
            nums[i] = arr1[j];
            j++;
            i++;
        }
    }

    public static void main(String[] args) {

    }
}
