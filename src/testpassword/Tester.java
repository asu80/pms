package testpassword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author asmita.shrestha
 */
public class Tester {

    public static void main(String[] args) {
        String merchant = "abcda";
        String test = "abcd,nccp,ntam,ncell";
//        List<String> myList = new ArrayList<String>(Arrays.asList(test.split(",")));
//        for (String string : myList) {
//            System.out.println("string:" + string.toString());
//        }
//        System.out.println("myList:" + myList);
//        if (myList.contains(merchant)) {
//            System.out.println("continue");
//        } else {
//            System.out.println("error Message");
//        }
        Map<String, String> map = new HashMap<>();
        List<String> myList = new ArrayList<String>(Arrays.asList(test.split(",")));
        for (String string : myList) {
            map.put(string, string);
        }
        if (map.containsKey(merchant)) {
            System.out.println("continue");
        } else {
            System.out.println("error Message");
        }
        System.out.println("DATE: " + new Date());
    }

}
