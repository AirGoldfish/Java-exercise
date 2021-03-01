package javaexercise;

import java.util.Arrays;
import java.util.Scanner;

public class question40 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        StringSort(str);
    }
    public static void StringSort(String str){
        char[] a=str.toCharArray();
        Arrays.sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }
}
