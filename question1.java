package javaexercise;

public class question1 {
    public static void main(String[] args) {
        long[] month = new long[50];
        month[1]=1;
        month[2]=1;
        System.out.println("第1个月，共有兔子2只");
        System.out.println("第2个月，共有兔子2只");
        for(int i=3 ;i<month.length;i++){
            month[i]=month[i-1]+month[i-2];
            System.out.println("第"+i+"个月，共有兔子"+month[i]*2+"只");
        }
    }
}