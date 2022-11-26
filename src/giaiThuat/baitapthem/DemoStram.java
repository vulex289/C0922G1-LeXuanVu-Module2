package giaiThuat.baitapthem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoStram {
    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();
        items.add("one");
        items.add("two");
        items.add("three");
        items.add("fore");
        items.add("five");

        Stream<String> stream = items.stream();
        stream.filter(item->item.startsWith("t"));
        items.forEach(System.out::println);
    }

}
