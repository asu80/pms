/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpassword;

/**
 *
 * @author asmita.shrestha
 */
public class StringTest {

    public static void main(String[] args) {
        String a = "";
        String b = " ";
        System.out.println("a " + a.length());
        System.out.println("b " + b.length());
        if (a.isEmpty() && a.length() < 0) {
            System.out.println("a empty");
        }

        if (b == null) {
            System.out.println("b null");
        }
    }

}
