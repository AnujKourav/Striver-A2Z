package DSA.Beginner;

public class BasicArray {

    public static int arraySum(int arr[]) {
        int ans = 0;
        for(int a:arr){
            ans = ans + a;
        }
        return ans;
    }

    public static int countOdd(int[] arr, int n) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0)count++;
        }
        return count;
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1])return false;
        }
        return true;
    }

    public static void reverse(int[] arr, int n) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

    }
}
