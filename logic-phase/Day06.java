import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println();

        String name = "Muhammad Mujahid";
        String anotherName = "ABC";
        System.out.println(name.compareTo(anotherName));
        System.out.println(name.length());
        System.out.println();

        String s1 = String.valueOf('C');
        String s2 = String.valueOf(10);
        System.out.println(s1);
        System.out.println(s1.getClass());
        System.out.println(s2);
        System.out.println(s2.getClass());

        System.out.println(name + "\r " + anotherName);

        String className = "Batch 342";
        String subClass = className.substring(2);
        String subSubClass = className.substring(2, 5);
        System.out.println(subClass);
        System.out.println(subSubClass);

        String yapString = "minimum".replace("m", " ");
        yapString = "minimum".replaceFirst("m", "n");
        System.out.println(yapString);

        String replacedString = "XSIS Mitra Utama BATCH 342 . aeljfaekfjsakl ! wlafjasldfkjal / alkjerlwjlk & wljerwkjewlr";
        System.out.println(replacedString);
        System.out.println(replacedString.replaceAll("[aA]", "*"));
        System.out.println(replacedString.replaceAll("[^aA]", "*"));
        System.out.println(replacedString.replaceAll("[a-zA-Z]", "*"));
        System.out.println(replacedString.replaceAll("[^a-zA-Z]", "*"));
        System.out.println(replacedString.replaceAll("[a-zA-Z&&[b-mB-M]]", "*"));
        System.out.println(replacedString.replaceAll("[a-zA-Z&&[^b-mB-M]]", "*"));
        System.out.println(replacedString.replaceAll("[0-9]", "*"));
        System.out.println(replacedString.replaceAll("[^0-9]", "*"));
        System.out.println(replacedString.replaceAll("[ .!/%]", "||"));

        String stringBener = replacedString.substring(0, 26);
        System.out.println(stringBener);
        System.out.println(stringBener.replace(" ", ""));
        String[] arrStr = stringBener.split(" ");
        System.out.println(Arrays.toString(arrStr));
        String joinStr = "";
        for (String string : arrStr) {
        joinStr += string;
        }
        System.out.println(joinStr);
        String strJoin = String.join(" ", arrStr);
        System.out.println(strJoin);
        char[] arrCharStr = stringBener.toCharArray();
        System.out.println(arrCharStr);

        String compareString = "xsis mitra utama batch 342";
        System.out.println(stringBener);
        System.out.println(compareString);
        System.out.println("Equals: " + compareString.equals(stringBener));
        System.out.println("Equals Ignore Case: " +
        compareString.equalsIgnoreCase(stringBener));
        System.out.println("Contains: " + stringBener.contains("xsis"));
        System.out.println("Contains: " +
        stringBener.contains("xsis".toUpperCase()));
    }
}
