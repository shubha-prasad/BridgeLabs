import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,5,1,6,7,8);
        List<String> list1 = Arrays.asList("Goutham","ABC","Sagar","Shubha");
        list.stream().distinct().forEach(System.out::println);


    }
}
