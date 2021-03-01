package javaexercise;

import java.util.Arrays;

public class question35 {
    public static void main(String[] args) {
        int[] a=MakeNum();
        System.out.println(Arrays.toString(a));
        Sort(a);
        System.out.println(Arrays.toString(a));
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
    public static void Sort(int[] a){
        int max=-10000,min=10000,maxnum = 0,minnum=a.length-1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max) {
                maxnum = i;
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min) {
                minnum = i;
                min = a[i];
            }
        }
        int temp;
        temp=a[0];
        a[0]=a[maxnum];
        a[maxnum]=temp;
        temp=a[a.length-1];
        a[a.length-1]=a[minnum];
        a[minnum]=temp;
    }
}
