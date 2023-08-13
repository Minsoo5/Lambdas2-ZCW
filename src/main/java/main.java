import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {




        List<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        intArray.add(6);

        System.out.println(intArray);

        List<Integer> newArray = intArray.stream()
                .filter(x -> x > 3)
                .collect(Collectors.toList());

        System.out.println(newArray);

    }
}
