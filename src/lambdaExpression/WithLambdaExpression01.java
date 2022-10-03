package lambdaExpression;

@FunctionalInterface
interface InterFace{
    public void m1();
}

public class WithLambdaExpression01 {
    public static void main(String[] args) {
        InterFace i = ()-> System.out.println("Lambda m1() implementation");
        i.m1();
    }
}
