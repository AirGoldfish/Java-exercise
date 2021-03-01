package javaexercise;

public class question22 {
    public static void main(String[] args) {
        System.out.println(fn(5));
    }
    public static int fn(int a){
        if(a==1){
            return 1;
        }
        else {
            return a*fn(a-1);
        }
    }
}
