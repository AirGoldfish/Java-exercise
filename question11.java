package javaexercise;

public class question11 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<5;i++){
            for(int j = 1;j<5;j++){
                for(int k = 1;k<5;k++){
                    if((i==j)||(i==k)||(j==k)) continue;
                    System.out.println(i*100+j*10+k);
                    sum++;
                }
            }
        }
        System.out.println("共有"+sum+"个");
    }
}
