package javaexercise;

public class question10 {
    public static void main(String[] args) {
        double sum=0,height=100;
        for(int i =0;i<10;i++){
            sum=sum+height;
            height=height/2;
            System.out.println(height);
        }
        System.out.println("十次反弹后共经过"+sum+"米,第十次反弹高度为"+Math.pow(0.5,10)*height);
    }
}
