package lambdaExpression;

interface Interface02{
    void add(int a , int b);
}
class Demo02 implements Interface02{
    @Override
    public void add(int a, int b) {
        System.out.println("The sum : "+(a+b));
    }
}
public class WithoutLambdaExpression02 {
    public static void main(String[] args) {
        Interface02 i = new Demo02();
        i.add(10,20);
    }
}
