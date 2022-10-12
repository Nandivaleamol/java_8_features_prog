package defaultstatic;

public class DefaultMethodInsideInterface implements Interf{

    @Override
    public void m1() {
        System.out.println("Implementation of m1() abstract method ");
    }

    @Override
    public void m2() {
        Interf.super.m2();
        System.out.println("m2() default override method in class");

    }

    public static void main(String[] args) {
        Interf i = new DefaultMethodInsideInterface();
        i.m1();
        i.m2();
        System.out.println(i.squareIt(5));
    }
}

@FunctionalInterface
interface Interf{
    void m1();

    default void m2(){
        System.out.println("Default m2() default method inside Interf interface");
    }
    default int squareIt(int n){
        return n*n;
    }
}
