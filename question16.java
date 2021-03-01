package javaexercise;

public class question16 {
    public static void main(String[] args) {
        for(int i = 1;i<10;i++){
            for(int j =1 ;j<10;j++){
                if(j<i) {
                    System.out.print(j + "x" + i + "=" + i * j+" ");
                }
                if(j==i){
                    System.out.println(j + "x" + i + "=" + i * j);
                }
            }
        }
    }
}
