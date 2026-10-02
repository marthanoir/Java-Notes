
class A{
    
    public A(){
        super();
        System.out.println("A constructor Visited.");
    }

    public A (int n){
        super();
        System.out.println("A int constructor Visited.");
    }
}

class B extends A{

    public B(){
        super();
        System.out.println("B constructor Visited.");
    }

    public B(int B){
        this();
        System.out.println("B int constructor visited.");
    }
}

public class thissuper{
    public static void main(String[] args){
        B obj = new B(5);
    }
}
