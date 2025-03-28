

import java.util.Scanner;

public class baseconversion {

    public static void main(String[] args) {
        int num , index =0;
        int binary[] = new int[40];
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter an integer");
            num = in.nextInt();
        }
        int temp1 = num;
        while(temp1>0){
            binary[index]=temp1 % 2;
            temp1 =temp1/2;
            index++;

        }
        System.out.println("Binary of given integer is:");
        for(int i =index-1;i>=0;i--){
            System.out.println(binary[i]);

        }
        int temp2=num,rem=0;
        String octal =" ";

        char octalchars[]={'0','1','2','3','4','5','6','7'};
        while(temp2>0){
            rem = temp2%8;
            octal =octalchars[rem]+octal;
            temp2 =temp2/8;
            System.out.println("rem :"+rem);
            System.out.println("octal :"+octal);
            System.out.println("temp2 :"+temp2);

        }
        System.out.println(" octal of the given integer is " +octal);
        int temp3 =num;
        String hex =" ";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(temp3>0){
            rem=temp3%16;
            hex=hexchars[rem]+hex;
            temp3 =temp3/16;

        }
        System.out.println("Hexadecimal of given integer :"+hex);

    }
    
}
