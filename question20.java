package javaexercise;

public class question20 {
    public static void main(String[] args) {
        double[] a = new double[20];
        double[] b = new double[20];
        double sum=0;
        a[0]=2;
        a[1]=3;
        b[0]=1;
        b[1]=2;
        for(int i =2;i<20;i++){
            a[i]=a[i-1]+a[i-2];
            b[i]=b[i-1]+b[i-2];
        }
        for(int j = 0;j<20;j++){
            sum=sum+(a[j]/b[j]);
        }
        System.out.println(sum);
    }
}
