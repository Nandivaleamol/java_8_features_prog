package defaultstatic;

public class StaticMethodInsideInterface implements StaticMethod{

    @Override
    public void m1(){
        System.out.println("m1() abstract method of interface");
    }

    public static void main(String[] args) {
        StaticMethod sm = new StaticMethodInsideInterface();
        sm.m1();
        StaticMethod.m2();
        System.out.println(StaticMethod.squareIt(5));

    }
}

@FunctionalInterface
interface StaticMethod{
    void m1();

    static void m2(){
        System.out.println("m2() static method inside interface");
    }
    static int squareIt(int n){
        return n*n;
    }
}
