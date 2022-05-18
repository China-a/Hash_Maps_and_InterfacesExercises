package Interfaces.ListAsAMethodParameter;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }


    public static Integer returnSize(List list) {
        return list.size();
    }

}
