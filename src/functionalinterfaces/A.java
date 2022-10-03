package functionalinterfaces;


@FunctionalInterface
public interface A {
    public void m1();

}

@FunctionalInterface
interface B extends A{

    @Override
    public void m1();
}
