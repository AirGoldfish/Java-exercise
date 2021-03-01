package javaexercise;

import java.util.Scanner;

public class question38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        StringLength(str);
    }

    public static void StringLength(String str) {
        char[] a=str.toCharArray();
        System.out.println(a.length);
    }
}
