package com.f1soft.name.validation;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author asmita.shrestha
 */
public class IBFTNameValidationDTO implements Serializable {

    private String code;
    private String message;
    private String accountNumber;
    private String swiftCode;
    private String requestedName;
    private String uniqueId;
    private ResponseMapNameValidation responseMap;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getRequestedName() {
        return requestedName;
    }

    public void setRequestedName(String requestedName) {
        this.requestedName = requestedName;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public ResponseMapNameValidation getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(ResponseMapNameValidation responseMap) {
        this.responseMap = responseMap;
    }
}
