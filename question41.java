package javaexercise;

public class question41 {
    public static void main(String[] args) {
        for (double i = 5; i <99999; i++) {
            boolean flag=true;
            double save=i;
            for (int j = 0; j < 4; j++) {
                save=(save-1)/5;
                if((save<6)||(save%1!=0)){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("原来沙滩上最少有桃子"+i+"个");
                System.exit(0);
            }
        }
    }
}
