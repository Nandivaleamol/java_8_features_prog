package lambdaExpression;

@FunctionalInterface
interface Interface02B{
    void add(int a , int b);

    // default  method must be give body...
    default void m1() {
        System.out.println("Default method implementation...");
    }
    // static method also must be give body...
    static void m2(){
        System.out.println("Static method  implementation...");
    }
}
public class WithLambdaExpression02 {
    public static void main(String[] args) {
        Interface02B i = (a, b)-> System.out.println("The Sum : "+ (a+b));
        i.add(10, 20);

        // invoke/ call default and static methods
        i.m1();
        Interface02B.m2();

    }
}
