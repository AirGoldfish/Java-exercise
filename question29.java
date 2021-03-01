package javaexercise;

public class question29 {
    public static void main(String[] args) {
        int[][] num=MakeNum();
        int sum=0;
        for (int i = 0; i < 3; i++) {
            sum=sum+num[i][i];
        }
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                System.out.print(num[i][j]+"\t");
                if(j==2) System.out.println();
            }
        }
        System.out.println(sum);
    }

    public static int[][] MakeNum() {
        int[][] a=new int[3][3];
        for(int i =0;i<3;i++) {
            for(int j=0;j<3;j++) {
                a[i][j]=(int)(Math.random()*20)+1;
            }
        }
        return a;
    }
}
