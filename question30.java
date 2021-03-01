package javaexercise;

import java.util.Arrays;
import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num=MakeNum();
        System.out.println("插入排序前序列为："+ Arrays.toString(num));
        int[] newnum=Arrays.copyOf(num,num.length+1);
        System.arraycopy(num,0,newnum,0,num.length);
        newnum[newnum.length-1]=scanner.nextInt();
        InsertionSort(newnum);
    }
    public static int[] MakeNum() {
        int a[]=new int[10];
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
    public static void InsertionSort(int[] a) {
        System.out.println("插入排序前序列为："+ Arrays.toString(a));
        for (int i=1;i<a.length;i++) {
            for(int j=i;j>0&&(a[j]<(a[j-1]));j--) {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
        System.out.println("插入排序后序列为："+Arrays.toString(a));
    }
}
