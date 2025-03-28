package as.asw.aswi;
public class calc {
    public static void main(String[] args) {
        int a,b,sum,diff,pro,quo,rem;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        sum=a+b;
        pro=a*b;
        diff=a-b;
        quo=a/b;
        rem=a%b;
        System.out.println("sum="+sum);
        System.out.println("differance="+diff);
        System.out.println("product="+pro);
        System.out.println("division="+quo);
        System.out.println("reminde="+rem);
    }
}
