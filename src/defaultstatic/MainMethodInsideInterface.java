package defaultstatic;

public interface MainMethodInsideInterface {

    default void m1(){
        System.out.println("This is m1() default method inside interface");
    }

    public static int squareIt(int n){
        return n*n;
    }

    public static void main(String[] args) {
        System.out.println("main() method inside interface");

        MainMethodInsideInterface m = new MainMethodInsideInterface() {
            @Override
            public void m1() {
                System.out.println("m1() default method inside interface");
            }
        };

        int i = MainMethodInsideInterface.squareIt(5);
        System.out.println(i);
    }
}
