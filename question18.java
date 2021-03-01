package javaexercise;

public class question18 {
    public static void main(String[] args) {
        for(int i = 97;i<100;i++){
            for(int j = 120;j<123;j++){
                if((i==97)&&(j==120)) continue;
                if(((i==99)&&(j==120))||((i==99)&&(j==122))) continue;
                System.out.println((char)i+" vs "+(char)j);
            }
        }
    }
}
