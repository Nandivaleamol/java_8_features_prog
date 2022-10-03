package lambdaex;

@FunctionalInterface
interface Interf{
    public void add(int a, int b);
}
public class LambdaExpression01 {
    public static void main(String[] args) {
        Interf i = (a,b)-> System.out.println("The sum : "+(a+b));
        i.add(10,18); // The sum : 28
        i.add(19,99); // The sum : 118
    }
}
