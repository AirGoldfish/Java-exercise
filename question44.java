package javaexercise;

public class question44 {
    public static void main(String[] args) {
        int a, b, c;//a：公鸡，b：母鸡，c：小鸡
        for (a = 1; a <= 20; a++) {
            for(b = 1;b<=34;b++){
                for(c = 3;c<=300;c=c+3){
                    if((5*a+3*b+c/3==100)&&(a+b+c==100)){
                        System.out.println("可以买公鸡"+a+"只，母鸡"+b+"只，小鸡"+c+"只");
                    }
                }
            }
        }
    }
}
