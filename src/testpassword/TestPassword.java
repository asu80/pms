/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpassword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author asmita.shrestha
 */
public class TestPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("password " + BCrypt.checkpw("NAR1234 ", "$2a$10$I/3fjbIypj03DW.y79jwL.g268SuthdWlfoVVyLmfd.FbbnFy0fuy"));
//        System.out.println("Txn  " + BCrypt.checkpw("nar1234", "$2a$10$I/3fjbIypj03DW.y79jwL.g268SuthdWlfoVVyLmfd.FbbnFy0fuy"));
//        int a = 0b10000;
//        System.out.println("" + a);
        System.out.println("pw: " + BCrypt.hashpw("nar1234", BCrypt.gensalt()));
        
//        String s = "abc";
//        System.out.println("s: " + s);
//        s.substring(0, 2);
//        System.out.println("s sub: " + s);

    }
}
