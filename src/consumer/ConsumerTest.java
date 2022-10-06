package consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m-> System.out.println(m.name+" is ready to release");
        Consumer<Movie> c2 = m->System.out.println(m.name+" is released but it is bigger flop!!!");
        Consumer<Movie> c3 = m-> System.out.println(m.name+" storing information into database");
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        Movie m = new Movie("SpiderX");
        cc.accept(m);
    }
}
class Movie{
    String name;
    Movie(String name){
        this.name = name;
    }
}