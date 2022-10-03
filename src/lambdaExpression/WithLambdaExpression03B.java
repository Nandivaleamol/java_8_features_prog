package lambdaExpression;

@FunctionalInterface
interface Interface03B{
    int square(int n);
}

public class WithLambdaExpression03B {
    public static void main(String[] args) {
        Interface03B i = n -> n*n;
        System.out.println("Square of 10 is : "+i.square(10));
        System.out.println("Square of 20 is : "+ i.square(20));
    }
}
