package lambdaex;

interface Interf02{
    public int squareIt(int n);
}

public class LambdaExpression02 {
    public static void main(String[] args) {
        Interf02 i = (n) -> n * n;
        System.out.println(i.squareIt(4)); // 16
        System.out.println(i.squareIt(5)); // 25
    }
}
