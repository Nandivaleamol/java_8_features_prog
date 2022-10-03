package lambdaExpression;

@FunctionalInterface
interface InterFace1{
    void m1();
}
class Demo1 implements InterFace1{
    public void m1(){
        System.out.println("Without lambda m1() method implementation");
    }
}
public class WithoutLambdaExpression01 {
    public static void main(String[] args) {
        InterFace1 i1 = new Demo1();
        i1.m1();
    }
}
