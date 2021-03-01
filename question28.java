package javaexercise;

import java.util.Arrays;

public class question28 {
    public static void main(String[] args) {
        int[] a=MakeNum();
        SelectionSort(a);
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
    public static void SelectionSort(int a[]) {
        System.out.println("选择排序前序列为："+ Arrays.toString(a));
        for(int i = 0;i<a.length;i++) {
            int temp = i;
            for(int j=i;j<a.length;j++) {
                if(a[temp]>a[j]) {
                    temp=j;
                }
            }
            int t=a[i];
            a[i]=a[temp];
            a[temp]=t;
        }
        System.out.println("选择排序后序列为："+Arrays.toString(a));
    }
}
