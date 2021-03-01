package javaexercise;

public class question13 {
    public static void main(String[] args) {
        for(int i = -10000;i<10000;i++){
            for(int j = 1;j<100;j++){
                if(Math.pow(j,2)==i+100){
                    for(int k = 1;k<100;k++){
                        if(Math.pow(k,2)==i+268) System.out.println(i);
                    }
                }
            }
        }
    }
}
