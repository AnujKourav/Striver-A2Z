package DSA.Array;
import java.util.*;
public class FAQsMedium {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)return nums[0];
        Arrays.sort(nums);
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > nums.length/2)return nums[i];
            }
            else count = 1;
        }
        return -1;
    }
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);
        int max = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] >= max){
                max = nums[i];
                list.add(nums[i]);
            }
        }
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        return list;
    }
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int a = 0;
        int b = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                ans[a] = nums[i];
                a = a + 2;
            }
            else if(nums[i] < 0){
                ans[b] = nums[i];
                b = b + 2;
            }
        }
        return ans;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;
        int left = 0;
        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<= right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public int pascalTriangleI(int r, int c) {
        int [][]pas = new int[r+1][r+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if(j == 1)pas[i][j] = 1;
                else if(i==j)pas[i][j] = 1;
                else pas[i][j] = pas[i-1][j-1] + pas[i-1][j];
            }
        }
        return pas[r][c];
    }
    public int[] pascalTriangleII(int r) {
        int [][]pas = new int[r+1][r+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if(j == 1)pas[i][j] = 1;
                else if(i==j)pas[i][j] = 1;
                else pas[i][j] = pas[i-1][j-1] + pas[i-1][j];
            }
        }
        int ans[] = new int[r];
        for(int i=0;i<r;i++){
            ans[i] = pas[r][i+1];
        }
        return ans;
    }
    public List<List<Integer>> pascalTriangleIII(int r) {
        List<List<Integer>> pas = new ArrayList<>();
        for (int i = 1; i <= r; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1) list.add(1);
                else if (i == j) list.add(1);
                else {
                    int a = pas.get(i - 2).get(j - 2);
                    int b = pas.get(i - 2).get(j - 1);
                    list.add(a + b);
                }
            }
            pas.add(list);
        }
        return pas;
    }
    public void rotateMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            int j = 0;
            int k = matrix[0].length-1;
            while(j<k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(row[i] || col[j] )matrix[i][j] = 0;
            }
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i]))return new int[]{i,map.get(target-nums[i])};
            else map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    //Dutch National Flag Algo
    public void sortZeroOneTwo(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        while(j<=k){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[j] == 1)j++;
            else if(nums[j] == 2){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
            }
        }
    }
    // Kadane's Algo
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            ans = Math.max(ans,sum);
            if(sum <= 0)sum = 0;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}

