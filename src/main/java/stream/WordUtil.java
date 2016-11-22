package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.toUpperCase;

public class WordUtil {

    // TODO: Implement using Stream API
    public static List<String> upCase(List<String> words) {
        return words.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    // TODO: Implement using Stream API
    public static List<String> upCaseFirst(List<String> words) {
        return words.stream().map(w -> toUpperCase(w.charAt(0)) + w.substring(1)).collect(Collectors.toList());
    }

    // TODO: Implement using Stream API
    public static <T> long countBy(List<T> words, Predicate<T> predicate) {
        return words.stream().filter(predicate).count();
    }

    public static <T> List<T> zip(List<T> words1, List<T> words2) {
        Stream<T> first = words1.stream();
        Iterator<T> iterator = words2.stream().iterator();

        Stream<T> result = first.flatMap(
            t -> iterator.hasNext() ? Arrays.asList(t, iterator.next()).stream() : Arrays.asList(t).stream()
        );

        if (iterator.hasNext()) {
            return Stream.concat(result, words2.stream().skip(words1.size())).collect(Collectors.toList());
        }

        return result.collect(Collectors.toList());
    }

    public static int maxLength(List<String> words) {
        // TODO: Implement using Stream reduce
        return words.stream().map(String::length).max(Integer::compare).get();
    }

    public static Map<String, Long> groupBy(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
