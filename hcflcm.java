import java.util.Scanner;

public class hcflcm {
    public static void main(String[] args) {
        int temp1,temp2,temp,hcf,lcm,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
         a =sc.nextInt();
         System.out.println("enter second number");
         b = sc.nextInt();
         temp1=a;
         temp2=b;
         while(temp2!=0){
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
         }
         hcf=temp1;
         lcm=(a*b)/hcf;
         System.out.println("HCF of input no :"+hcf);
         System.out.println("LCM of input no :"+lcm);
    }
    
}
