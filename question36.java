package javaexercise;

import java.util.Arrays;
import java.util.Scanner;

public class question36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m,n;
        n=scanner.nextInt();
        m=scanner.nextInt();
        int[] a=MakeNum(n);
        System.out.println(Arrays.toString(a));
        MoveNum(a,m);
        System.out.println(Arrays.toString(a));
    }
    public static int[] MakeNum(int n) {
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            for(int j=0;j<i;j++) {
                if(a[i]==a[j]) {
                    i--;
                    break;
                }
            }
        }
        return a;
    }
    public static void MoveNum(int[] a,int m) {
        int[] t=new int[m];
        System.arraycopy(a,a.length-m,t,0,m);
        System.arraycopy(a,0,a,m,a.length-m);
        System.arraycopy(t,0,a,0,m);
        System.out.println(Arrays.toString(t));
    }
}
