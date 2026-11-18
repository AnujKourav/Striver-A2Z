package DSA.Beginner;
import java.util.*;
public class Recursion {
    public int getSum(int N){
        if(N == 1)return 1;
        return N + getSum(N-1);
    }
    public int NnumbersSum(int N) {
        int ans = getSum(N);
        return ans;
    }

    public long Fact(int n){
        if(n == 1)return 1;
        return n * Fact(n-1);
    }
    public long factorial(int n) {
        if( n == 0 || n == 1)return 1;
        long ans = Fact(n);
        return ans;
    }

    public int getSum(int []nums, int i){
        if(i == nums.length)return 0;
        return nums[i] + getSum(nums, ++i);
    }
    public int arraySum(int nums[]) {
        int i = 0;
        int ans = getSum(nums,i);
        return ans;
    }

    public ArrayList<Character> reverse(ArrayList<Character> s, int i, int j){
        if(i >= j)return s;
        char ch = s.get(j);
        s.set(j,s.get(i));
        s.set(i,ch );
        return reverse(s , ++i, --j);
    }
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        return reverse(s,0,s.size()-1);
    }

    public boolean palindrome(String s, int  i, int j ){
        if(i >= j)return true;
        if(s.charAt(i) != s.charAt(j))return false;
        return palindrome(s,++i,--j);
    }
    public boolean palindromeCheck(String s) {
        return palindrome(s,0,s.length()-1);
    }

    // sieve of Erasthanos
    public boolean checkPrime(int num) {
        if(num == 2 || num == 3)return true;
        if(num % 2 == 0 || num % 3 == 0)return false;
        for(int i=5;i*i<=num;i=6+i){
            if(num % i == 0 || num % (i+2) == 0)return false;
        }
        return true;
    }

    public int[] reverse(int []nums, int i, int j){
        if(i >= j)return nums;
        int a = nums[i];
        nums[i] = nums[j];
        nums[j] = a;
        return reverse(nums, ++i , --j);
    }
    public int[] reverseArray(int[] nums) {
        return reverse(nums,0,nums.length-1);
    }

    public int[] reverseArrayUsingAddSub(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
            i++;
            j--;
        }
        return nums;
    }
    public int[] reverseArrayUsingXOR(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            nums[i] = nums[i] ^ nums[j];
            nums[j] = nums[i] ^ nums[j];
            nums[i] = nums[i] ^ nums[j];
            i++;
            j--;
        }
        return nums;
    }

    public boolean check(ArrayList<Integer> nums, int i){
        if(i == nums.size())return true;
        if(nums.get(i) < nums.get(i-1))return false;
        return check(nums, ++i);
    }
    public boolean isSorted(ArrayList<Integer> nums) {
        return check(nums,1);
    }

    public int add(int nums){
        int ans = 0;
        while(nums > 0){
            int rem = nums % 10;
            ans = ans + rem;
            nums = nums / 10;
        }
        return ans;
    }
    public int addDigits(int num) {
        if(num < 9)return num;
        int ans = add(num);
        while(ans > 9)ans = add(ans);
        return ans;
    }

    public int fibo(int n, int a, int b,int i){
        if(i == n)return b;
        int c = a + b;
        a = b;
        b = c;
        return fibo(n,a,b,++i);
    }
    public int fib(int n) {
        if(n == 0)return 0;
        return fibo(n,0,1,1);
    }

    public int fibRec(int n) {
        if(n <= 1)return n;
        return fibRec(n-1) + fibRec(n-2);
    }

    public static void main(String[] args) {

    }
}
