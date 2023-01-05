package interview;

import java.util.StringJoiner;

//Java 8 Program to add prefix and suffix to the String?
public class StringJoinerSuffixAndPrefix {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",","#","#");
        stringJoiner.add("Interview");
        stringJoiner.add("Question");
        stringJoiner.add("Answer");

        System.out.println("After adding # in suffix and prefix: ");
        System.out.println(stringJoiner);

    }
}
