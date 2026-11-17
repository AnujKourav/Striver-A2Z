package DSA;
import java.util.*;

public class BasicMath {
    public void countDigit(int n){
        if(n == 0){
            System.out.println(1);
            return;
        }
        int ans = 0;
        while(n > 0){
            n = n / 10;
            ans++;
        }
        System.out.print(ans);
    }
    public void countOddDigit(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            if(rem % 2 != 0)ans++;
        }
        System.out.print(ans);
    }
    public void reverseNumber(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        System.out.print(ans);
    }
    public void palindrome(int n){
        int a = n;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        if(ans == a) System.out.print("True");
        else System.out.println("False");
    }

    public static int largestDigit(int n) {
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem > ans)ans = rem;
            n = n / 10;
        }
        return ans;
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1)return 1;
        return n * factorial(n-1);
    }

    public static int numberOfDigits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    public static boolean isArmstrong(int n) {
        int p = numberOfDigits(n);
        double ans = 0;
        int a = n;
        while(a > 0){
            int rem = a % 10;
            ans = ans + Math.pow(rem,p);
            a = a / 10;
        }
        if(ans == n)return true;
        return false;
    }

    public boolean isPerfect(int n) {
        int ans = 0;
        for(int i=1;i<=n/2;i++){
            if(n % i == 0)ans = ans + i;
        }
        if(ans == n)return true;
        return false;
    }

    public static boolean isPrime(int n) {
        if(n <= 1)return false;
        if(n == 2 || n == 3)return true;
        // for(int i=2;i*i<=n;i++){
        //     if(n % i == 0)return false;
        // }
        // return true;

        //Sieve of Eratosthenes
        if(n % 2 == 0 || n % 3 == 0)return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i == 0 || n%(i+2)==0)return false;
        }
        return true;
    }

    public static boolean prime(int n){
        if(n == 2 || n == 3)return true;
        // for(int i=2;i*i<=n;i++){
        //     if(n % i == 0)return false;
        // }
        // return true;
        if(n % 2 == 0 || n % 3 == 0)return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n % i == 0 || n % (i+2) == 0)return false;
        }
        return true;
    }
    public static int countPrimes(int n) {
        if(n <= 1)return 0;
        int count = 0;
        for(int i=2;i<n;i++){
            if(prime(i))count++;
        }
        return count;
    }

    public static int gcd(int n1, int n2) {


        // int n = Math.min(n1,n2);
        // for(int i=n;i>1;i--){
        //     if(n1 % i == 0 && n2 % i == 0)return i;
        // }
        // return 1;


        // Euclidean Algo
        // if(n1 == 0 || n2 == 0)return Math.max(n1,n2);
        // if(n1 == n2)return n1;
        // if(n1 > n2)return gcd(n1-n2,n2);
        // return gcd(n1,n2-n1);


        // if(n1 == 0 || n2 == 0)return Math.max(n1,n2);
        // if(n1 == n2)return n1;
        // if(n1 > n2){
        //     if(n1 % n2 == 0)return n2;
        //     return gcd(n1-n2,n2);
        // }
        // if(n2%n1 == 0)return n1;
        // return gcd(n1,n2-n1);


        if(n2 == 0)return n1;
        else return gcd(n2, n1% n2);
    }

    public static int lcm(int n1, int n2) {
        // int a = Math.max(n1,n2);
        // int b = Math.min(n1,n2);
        // if(a % n1 == 0 && a % n2 == 0)return a;
        // for(int i=a;i<=n1*n2;i=i+a){
        //     if(i % b == 0)return i;
        // }
        // return n1 * n2;


        //HCF(a,b) * LCM(a,b) = a*b
        int hcf = HCF(n1,n2);
        return (n1 * n2)/hcf;
    }
    public static int HCF(int n1,int n2){
        if(n1 == n2)return n1;
        if(n1 > n2)return HCF(n1-n2, n2);
        return HCF(n1,n2-n1);
    }

    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n % i == 0){
                if(n/i == i)list.add(i);
                else {
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicMath obj = new BasicMath();
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        obj.palindrome(a);
    }
}
