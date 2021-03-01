package javaexercise;

import java.util.Scanner;

public class question37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=1,counter,n=1,save;
        counter=scanner.nextInt();
        save=counter;
        boolean[] p=new boolean[counter+1];
        for (int i = 1; i <p.length; i++) {
            p[i]=true;
        }
        while(true){
            if(counter==1) break;
            if(n>save) n=1;
            if(p[n]){
                if(k==3){
                    k=1;
                    p[n]=false;
                    n++;
                    counter--;
                }
                else{
                    k++;
                    n++;
                }
            }
            else n++;
        }
        for (int i = 1; i <=save; i++) {
            if(p[i]) System.out.println("是第"+i+"个人");
        }
    }
}
