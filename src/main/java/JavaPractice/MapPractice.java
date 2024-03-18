package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String... args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "JAVA");
        map.put(2, "Python");
        map.put(3, "C");
        map.put(4, "c#");
        map.put(5, ".net");

        System.out.println(map);//{1=JAVA, 2=Python, 3=C, 4=c#, 5=.net}

        System.out.println(map.get(5));


        Map<Integer, String> m = new HashMap<>();

        m.put(7, "Regression");
        m.put(8, "Testing");

        m.putAll(map);
        System.out.println(m);
        m.putIfAbsent(5, "Added now");
        System.out.println(m);
        //System.out.println(m.keySet());
        //System.out.println(m.values());

        for (Map.Entry entry : m.entrySet()) {
            Object key = entry.getKey();
            System.out.println(m.get(key));
        }

        Set s = m.entrySet();
        Iterator itr = s.iterator();

        while (itr.hasNext()) {
            System.out.print(" "+itr.next());
        }
    }
}
