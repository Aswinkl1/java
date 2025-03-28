import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class sumrever {
    int a,m=0,sum=0;
    void sum(int num){
        do{
            a=num%10;
            sum=sum+a;
            num=num/10;

        }while(num>0);
        System.out.println("sum of digits ="+sum);
    }
    void reverse(int num){
        do{
            a=num%10;
            m=m*10+a;
            num=num/10;
        }while(num>0);
        System.out.println("reverse"+m);
      

    }

    

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
        sumrever obj = new sumrever();
        obj.sum(n);
        obj.reverse(n);

    }
}
