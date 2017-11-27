/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpassword;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asmita.shrestha
 */
public class ParameterSplit {

    public static void main(String[] args) {
        Map<Integer, DTO> map = new HashMap<Integer, DTO>();

        String paymentCode = "1 1235689 Asmita kumari Shrestha";
        String[] codeArr = paymentCode.split(" ");
        
        int startIndex = 2;
        String name = "";
        for (int i = startIndex; i <= codeArr.length - 1; i++) {
            name += codeArr[i] + " ";
        }
        
        System.out.println("name: " + name);
        
        int index = 0;
        String param = codeArr[index++];
        for (int j = 1; j <= 3; j++) {

            DTO dto = new DTO();
            dto.setParameter(param);
            map.put(j, dto);
            System.out.println("List parameter: " + dto.getParameter());
        }
    }

}
