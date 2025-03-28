import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        double p,area;
        System.out.println("enter 3 sides");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a<b+c)&&(b<a+c)&&(c<a+b)){
            if((a==b) && (b==c)){
                System.out.println("Equilateral triangle");
            }

           else if((a==b)||(b==c)||(c==a)){
                System.out.println("isoscelses triangle");
            }
            else{
                System.out.println("scalar triiangle");
            } 

            p=(a+b+c)/2;
            area =Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("area of the triangle is"+area);

            
        }
        else{
            System.out.println("cannot form a triangle");
        }
    }
}
