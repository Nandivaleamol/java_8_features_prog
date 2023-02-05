package interview;

public interface InterfaceMainMethod {
    static void main(String[] args) {
        m1();
    }
    static void m1(){
        System.out.println("static method called");
    }

    default void m2(){
        System.out.println("default method called");
    }
}
