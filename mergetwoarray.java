import java.util.Scanner;

public class mergetwoarray {
    public static void main(String[] args) {
        int a1,b1,c1=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        a1=s.nextInt();
        int a[]= new int[a1];
        System.out.println("Enter the size of second array");
        b1=s.nextInt();
        int b[]= new int[b1];
        c1=a1+b1;
        int c[] = new int[c1];
        System.out.println("Enter the element of first array");

        for(int i =0;i<a1;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter elements of second array");

        for(int i=0;i<b1;i++){
            b[i]=s.nextInt();
        }
        for(int i=0;i<a1;i=i+1){
            c[i]=a[i];
        }
        for(int i=0;i<b1;i=i+1){
            c[a1+i]=b[i];
        }
        System.out.println("first array is");

        for(int i=0;i<a1;i=i+1){
            System.out.println(a[i]);
        }

        System.out.println("second array is");
        for(int i=0;i<b1;i=i+1){
            System.out.println(b[i]);

        }
        System.out.println("the merged array is : ");
        for(int i=0;i<c1;i=i+1){
            System.out.println(c[i]);

        }

    }
    
}
