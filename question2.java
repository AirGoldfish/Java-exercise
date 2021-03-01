package javaexercise;

public class question2 {
    public static void main(String[] args) {
        for(int i = 101;i < 201;i++){
            boolean flag=true;
            for(int j = 2;j < Math.sqrt(i);j++){
                if(i % j == 0) flag=false;
            }
            if(flag) System.out.println(i);
        }
    }
}