package javaexercise;

public class question3 {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int a = i / 100;
            int b = i / 10 - a * 10;
            int c = i % 10;
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i){
                System.out.println(i);
            }
        }
    }
}
