package DSA;
import java.util.*;
public class Hashing {

    public static int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))map.put(nums[i], 1);
            else map.put(nums[i],map.get(nums[i]) + 1);
        }
        int ans = nums[0];
        for(int key:map.keySet()){
            if(map.get(key) == map.get(ans))ans = Math.min(key,ans);
            else if(map.get(key) > map.get(ans))ans = key;
        }
        return ans;
    }

    public static int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))map.put(nums[i],1);
            else map.put(nums[i], map.get(nums[i])+1);
        }
        int max1 = 0;
        int max2 = 0;
        int ele1 = -1;
        int ele2 = -1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > max1){
                max2 = max1;
                ele2 = ele1;
                max1 = value;
                ele1 = key;
            }
            else if(value == max1)ele1 = Math.min(ele1,key);
            else if(value > max2){
                max2 = value;
                ele2 = key;
            }
            else if(value == max2)ele2 = Math.min(ele2,key);
        }
        return ele2;
    }

    public static int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i]) + 1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) > max)max = map.get(key);
            if(map.get(key) < min)min = map.get(key);
        }
        return max + min;
    }

    public static void main(String[] args) {
        int a = 13;
    }

}
