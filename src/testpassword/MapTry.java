package testpassword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author asmita.shrestha
 */
public class MapTry {

    public static void main(String[] args) {
        Map<String, String[]> map = new HashMap<>();
        List<String> list = new ArrayList<String>();
        list.add("0125698");
        list.add("123654");
        int count = 1;
        for (String string : list) {

            String[] arrayOfStrings = list.toArray(new String[list.size()]);
//            map.put("A" + String.valueOf(count), string);
            map.put("A", arrayOfStrings);
            count++;

        }
        System.out.println("map: " + map);
    }

}
