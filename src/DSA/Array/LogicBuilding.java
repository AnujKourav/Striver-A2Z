package DSA.Array;
import java.util.*;
public class LogicBuilding {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        int n = nums.length;
        int ans = n*(n+1)/2;
        return ans - sum;
    }

    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer>list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
                list.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!set.contains(nums2[i])){
                set.add(nums2[i]);
                list.add(nums2[i]);
            }
        }
        Collections.sort(list);
        int ans[] = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public int[] intersectionArray(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i]))map.put(nums1[i],1);
            else map.put(nums1[i], map.get(nums1[i]) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
                if(map.get(nums2[i]) == 0)map.remove(nums2[i]);
            }
        }
        int ans[] = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
