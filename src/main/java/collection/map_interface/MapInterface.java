package collection.map_interface;

import java.util.*;

public class MapInterface {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(11159217, "Yeremeyev Timofey");
        map1.put(68171789, "Shelconog Natalya");
        map1.put(32454385, "Budkova Svetlana");
        map1.put(23487523, "Shelconog Aleksandr");
        Set<Integer> keys = map1.keySet();
        Iterator<Integer> keysIterator = keys.iterator();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        while (keysIterator.hasNext()) {
            integerArrayList.add(keysIterator.next());
        }
        for (int i = 0; i < map1.size(); i++) {
            System.out.println(map1.get(integerArrayList.get(i)))  ;
        }
    }
}
