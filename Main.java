import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, -4, 6, 7, 8);
        List<Integer> triple = numbers.stream()
                                      .map(n -> n * 3)
                                      .collect(Collectors.toList());
        System.out.println(triple);
    }
}