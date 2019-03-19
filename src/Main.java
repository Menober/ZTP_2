
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Class string=String.class;
        MyArray<String> strings = new MyArray<>(String.class, 6);
        System.out.println(strings.newObjInstance(String.class, "TuLiPan"));

        System.out.println("Intidżery:");
        MyArray<Integer> integers = new MyArray<>(Integer.class, 6);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.set(4, 100);
        integers.set(5, 999);
        System.out.println(integers);
        System.out.println("Item nr 3 to : " + integers.get(2));

        System.out.println("\nDable:");
        MyArray<Double> doubles = new MyArray<>(Double.class, 6);
        doubles.add(1.123);
        doubles.add(2.23);
        doubles.add(333.0123);
        doubles.add(4.434);
        doubles.set(4, 100.22);
        doubles.set(5, 999.7657);
        System.out.println(doubles);
        System.out.println("Item nr 3 to : " + doubles.get(2));


        System.out.println("\nPary:");
        Pair<List<String>> pair1 = new Pair<>(new ArrayList<>(Arrays.asList("Jeden", "Dwa")), new ArrayList<>(Arrays.asList("Dwa he", "Trzy hah!")));
        System.out.println(pair1);
        System.out.println(pair1.clone());

        Pair<Double> pair2 = new Pair<>(1.123,2.123);
        System.out.println(pair2);
        //System.out.println(pair2.clone());


        System.out.println("\nSety:");
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("String 1");
        set2.add("String 2");
        Pair<Set<String>> pair3 = new Pair<>(set1, set2);
        System.out.println(pair3);
        Pair<Set<String>> pair3copy = pair3.clone();
        set1.add("String 3");
        System.out.println(pair3);
        System.out.println(pair3copy);


        System.out.println("\nPsie pary:");
        Pair<Pies> pair5 = new Pair<>(new Pies("Azor", 2), new Pies("Kiel", 4));
        Pair<Pies> pair5copy = pair5.clone();
        System.out.println(pair5);
        System.out.println(pair5copy);
        pair5.getKey().setImie("Lucek");
        pair5.getValue().setWiek(33);
        System.out.println(pair5);
        System.out.println(pair5copy);

    }
}
