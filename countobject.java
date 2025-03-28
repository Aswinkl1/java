public class countobject {
    static int count=0;
    public countobject(){
        count+=1;
    }
    public countobject(int i){
        count +=1;
    }
    public static void main(String[] args) {
        countobject obj1 = new countobject();
        countobject obj2 = new countobject(9);
        countobject obj3 = new countobject();
        countobject obj4 = new countobject(5);
        System.out.println("number of objects created "+countobject.count);
    }
    
}
