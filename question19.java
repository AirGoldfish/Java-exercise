package javaexercise;

public class question19 {
    public static void main(String[] args) {
        char[] a = new char[7];
        for(int i = 1 ;i<=4;i++){
            for(int j = 1;j<=4-i;j++){
                System.out.print(" ");
            }
            for( int k = 1; k <= 2*i-1 ; k++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i =1 ;i<=3;i++){
            for( int j = 1;j <= i; j++){
                System.out.print(" ");
            }
            for( int k = 1; k <= 2*(3 - i + 1 )-1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
