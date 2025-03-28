public class second extends first{
    int a;
    void show(){
        System.out.println("its is second");
        a=10;
        super.a=100;
        int sum=a+super.a;
        System.out.println(sum);
    }
    void display(){
        super.show();
    }
    public static void main(String[] args) {
        second s=new second();
        s.show();
        s.display();
        
    }
    
}
