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
        for(int i=0;i<n;i++){
            boolean flag = true;
            if(i % 2 != 0)flag = false;
            for(int j=0;j<=i;j++){
                if(flag) System.out.print(1);
                else System.out.print(0);
                flag = !flag;
            }
            System.out.println();
        }
    }
    public void pattern12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j <= i) System.out.print(j);
                else System.out.print(" ");
            }
            for(int j=5;j>0;j--){
                if(j <= i) System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern13(int n){
        int j = 1;
        int k = 1;
        while(j <= n){
            int i = 1;
            while(i <= j) {
                System.out.print(k+" ");
                k++;
                i++;
            }
            System.out.println();
            j++;
        }
    }
    public void pattern14(int n){
        for(int i=0;i<n;i++){
            int ch = 65;
            for(int j=0;j<=i;j++){
                char c = (char)ch;
                System.out.print(c);
                ch = ch + 1;
            }
            System.out.println();
        }
    }
    public void pattern15(int n){
        for(int i=0;i<n;i++){
            int ch = 65;
            for(int j=0;j<n-i;j++){
                char c = (char)ch;
                System.out.print(c);
                ch = ch + 1;
            }
            System.out.println();
        }
    }
    public void pattern16(int n){
        int ch = 65;
        for(int i=0;i<n;i++) {
            for(int j = 0; j <= i; j++) {
                char c = (char)ch;
                System.out.print(c);
            }
            ch = ch + 1;
            System.out.println();
        }
    }
    public void pattern17(int n){
        for(int i=1;i<=n;i++){
            int ch = 65;
            for(int j=n;j>0;j--){
                char c = (char)ch;
                if(j <= i) {
                    System.out.print(c);
                    ch = ch + 1;
                }
                else System.out.print(" ");
            }
            ch = 63 + i;
            for(int j=2;j<=n;j++){
                if(i == 1)break;
                char c = (char)ch;
                if(j <= i)System.out.print(c);
                ch = ch - 1;
            }
            System.out.println();
        }
    }
    public void pattern18(int n){
        for(int i=0;i<n;i++){
            int ch = 69 - i;
            for(int j=0;j<=i;j++){
                char c = (char)ch;
                System.out.print(c);
                ch = ch + 1;
            }
            System.out.println();
        }
    }
    public void pattern19(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(j < n-i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if (j <= i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=4;j>=0;j--){
                if(j <= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern20(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j <= i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=n-1;j>=0;j--){
                if(j<=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(j<=i) System.out.print(" ");
                else System.out.print("*");
            }
            for(int j=0;j<n;j++){
                if(j<=i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern21(int n){

    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Pattern obj = new Pattern();
        obj.pattern20(n);
    }
}
