package javaexercise;

public class question21 {
    public static void main(String[] args) {
        double sum=0;
        for(int i = 1;i<=20;i++){
            double a = 1;
            for(int j=1;j<=i;j++){
                a=a/j;
            }
            sum=sum+1/a;
        }
        System.out.println(sum);
    }
}
