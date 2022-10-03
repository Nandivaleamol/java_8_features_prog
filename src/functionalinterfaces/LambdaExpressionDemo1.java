package functionalinterfaces;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface Interface{
    public void m1();
}
public class LambdaExpressionDemo1 {
    public static void main(String[] args) {
        Interface i = () -> System.out.println("Lambda Expression example");
        i.m1();
    }
}
