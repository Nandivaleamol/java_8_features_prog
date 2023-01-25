package supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class RandomIDGenerator {
    public static void main(String[] args) {
        Supplier<String> randomUUID = ()-> UUID.randomUUID().toString();
        System.out.println(randomUUID.get());  // get() method is a supplier interface SAM method.
        System.out.println(randomUUID.get());
    }
}
