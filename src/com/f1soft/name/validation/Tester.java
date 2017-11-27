package com.f1soft.name.validation;

import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author asmita.shrestha
 */
public class Tester {

    public static void main(String[] args) {
        try {
            String response = "{\n"
                    + "  \"code\": \"0\",\n"
                    + "  \"message\": \"Success\",\n"
                    + "  \"accountNumber\": \"0108010007091\",\n"
                    + "  \"swiftCode\": \"GLBBNPKA\",\n"
                    + "  \"requestedName\": \"Aadil Alam\",\n"
                    + "  \"uniqueId\": \"1\",\n"
                    + "  \"responseMap\": {\n"
                    + "    \"ACC001\": {\n"
                    + "      \"MESSAGE\": \"Complete Matched\",\n"
                    + "      \"FIRST_NAME\": \"0\",\n"
                    + "      \"MIDDLE_NAME\": \"4\",\n"
                    + "      \"LAST_NAME\": \"0\",\n"
                    + "      \"CODE\": \"0\"\n"
                    + "    }\n"
                    + "  }\n"
                    + "}";
            System.out.println("Response string::: " + response);



            IBFTNameValidationDTO iBFTNameValidationDTO = GsonUtils.fromJsonToObj(response, IBFTNameValidationDTO.class);
            System.out.println("code: " + iBFTNameValidationDTO.getCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println("message: " + iBFTNameValidationDTO.getMessage());

    }
}
