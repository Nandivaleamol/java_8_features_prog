package interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<List<String>> skills = Arrays.asList(
                Arrays.asList("Java", "Python"),
                Arrays.asList("JavaScript", "C++"),
                Arrays.asList("Go", "Rust"),
                Arrays.asList("String Boot", "Spring Framework")
        );

        var finalSkillList = skills.stream().flatMap(Collection::stream).toList();
        System.out.println(finalSkillList);

        var list = finalSkillList.stream().filter(skill -> skill.startsWith("S")).toList();
        System.out.println(list);
    }
}
