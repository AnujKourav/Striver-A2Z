package DSA.Sorting;

public class Sorting {
    public int[] bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean flag = true;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true)return nums;
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
