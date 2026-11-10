package DSA;
import java.util.*;
public class Pattern {
    public void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void pattern5(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern6(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int j=0;j<(i*2)+1;j++) System.out.print("*");
            System.out.println();
        }
    }
    public void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++) System.out.print(" ");
            for(int j=0;j<(n*2-1) - (i * 2) ;j++) System.out.print("*");
            System.out.println();
        }
    }
    public void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--) System.out.print(" ");
            for(int j=0;j<i*2+1;j++) System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++) System.out.print(" ");
            for(int j=0;j<(n*2-1)-(i*2);j++) System.out.print("*");
            System.out.println();
        }
    }
    public void pattern10(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>0;j--) System.out.print("*");
            System.out.println();
        }
    }
    public void pattern11(int n){

    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Pattern obj = new Pattern();
        obj.pattern10(n);
    }
}
