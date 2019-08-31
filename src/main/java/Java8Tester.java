import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Tester {

    public static void main(String[] args) {
        GreetingService greetingService1 = message -> System.out.println(message);
        greetingService1.sayMessage("Hello World!");


        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List filtered = strings.stream().filter(strin -> !strin.isEmpty()).collect(Collectors.toList());

        //forEach
        Random random = new Random();
        random.ints().limit(10).forEach(a -> System.out.println(a+10));

// 获取空字符串的数量
        int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}