import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day06 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Esemka");
        cars.add("fufufafa");
        cars.add("omon omon");
        cars.add("ikn");
        cars.add("makan siang");
        cars.add("yntkts");
        cars.add("raja jawa");
        cars.add("blt");

        Map<Integer, String> variableMap = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            variableMap.put(i, cars.get(i));
        }

        System.out.println(variableMap);
        System.out.println(variableMap.get(7));
        System.out.println(variableMap.get(cars.indexOf("ikn")));
        variableMap.replace(3, "MK");
        System.out.println(variableMap.containsKey(9));
        System.out.println(variableMap.containsValue("blt"));
        System.out.println(variableMap);
        variableMap.replace(3, "MK", "ikn");
        System.out.println(variableMap);
        Integer indexing = cars.indexOf("ikn");
        System.out.println(variableMap.get(indexing));

        Map<Integer, String> anotherMap = new HashMap<>(variableMap);
        anotherMap.put(8, "Anwar uSman");
        anotherMap.replace(8, anotherMap.get(8) + " ABC");
        System.out.println(anotherMap);
        System.out.println(variableMap);
        anotherMap.forEach((key, value) -> System.out.println(key + value));
        ArrayList<String> anotherList = new ArrayList<>();
        for (int i = 0; i < anotherMap.size(); i++) {
            anotherList.add(anotherMap.get(i));
        }
        for (String string : anotherList) {
            System.out.print(string + " ");
        }
    }
}
