package com.f1soft.name.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author asmita.shrestha
 */
public class PasswordMAp {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
//        list.add("GPRS");
        list.add("SMS");

        Map<String, String> map = new HashMap<String, String>();

        for (String string : list) {
            map.put(string, string);
        }

        if (map.containsKey("GPRS") && map.containsKey("SMS")) {
            System.out.println("map contains GPRS and SMS");
        } else if (map.containsKey("GPRS")) {
            System.out.println("map contains GPRS ");
        } else {
            System.out.println("map contains SMS");
        }
    }

}
