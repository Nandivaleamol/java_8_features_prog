package lambdaExpression;

interface Interface03A{
    int square(int n);
}
class Demo03A implements Interface03A{
    @Override
    public int square(int n) {
        return n*n;
    }
}
public class WithoutLambdaExpression03A {
    public static void main(String[] args) {
        Interface03A i = new Demo03A();
        System.out.println("Square of 10 is : "+ i.square(10));
        System.out.println("Square of 20 is : "+ i.square(20));
    }
}
