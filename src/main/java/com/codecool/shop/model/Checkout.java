package com.codecool.shop.model;

import java.util.HashMap;
import java.util.Map;

public class Checkout {
    private String name, email, phoneNumber;
    private String billingCountry, billingCity, billingZipCode, billingAddress;
    private String shippingCountry, shippingCity, shippingZipCode, shippingAddress;
    private Map<String, String> checkoutMap = new HashMap<>();
    private static Checkout chekout = null;

    private Checkout(Map checkoutData) {
        name = (String) checkoutData.get("name");
        email = (String) checkoutData.get("email");
        phoneNumber = (String) checkoutData.get("phoneNumber");
        billingCountry = (String) checkoutData.get("billingCountry");
        billingCity = (String) checkoutData.get("billingCity");
        billingZipCode = (String) checkoutData.get("billingZipCode");
        billingAddress = (String) checkoutData.get("billingAddress");
        shippingCountry = (String) checkoutData.get("shippingCountry");
        shippingCity = (String) checkoutData.get("shippingCity");
        shippingZipCode = (String) checkoutData.get("shippingZipCode");
        shippingAddress = (String) checkoutData.get("shippingAddress");
        checkoutMap.put("name", name);
        checkoutMap.put("email", email);
        checkoutMap.put("phoneNumber", phoneNumber);
        checkoutMap.put("billingCountry", billingCountry);
        checkoutMap.put("billingCity", billingCity);
        checkoutMap.put("billingZipCode", billingZipCode);
        checkoutMap.put("billingAddress", billingAddress);
        checkoutMap.put("shippingCountry", shippingCountry);
        checkoutMap.put("shippingCity", shippingCity);
        checkoutMap.put("shippingZipCode", shippingZipCode);
        checkoutMap.put("shippingAddress", shippingAddress);


    }

    public static Checkout getInstance(Map checkoutData) {
        if (chekout == null) {
            chekout = new Checkout(checkoutData);
        }
        return chekout;
    }

    public void setName(String name) {
        checkoutMap.put("name", name);
    }

    public void setEmail(String email) {
        checkoutMap.put("email", email);
    }

    public void setPhoneNumber(String phoneNumber) {
        checkoutMap.put("phoneNumber", phoneNumber);

    }

    public void setBillingCountry(String billingCountry) {
        checkoutMap.put("billingCountry", billingCountry);

    }

    public void setBillingCity(String billingCity) {
        checkoutMap.put("billingCity", billingCity);

    }

    public void setBillingZipCode(String billingZipCode) {
        checkoutMap.put("billingZipCode", billingZipCode);

    }

    public void setBillingAddress(String billingAddress) {
        checkoutMap.put("billingAddress", billingAddress);
    }

    public void setShippingCountry(String shippingCountry) {

        checkoutMap.put("shippingCountry", shippingCountry);
    }

    public void setShippingCity(String shippingCity) {
        checkoutMap.put("shippingCity", shippingCity);
    }

    public void setShippingZipCode(String shippingZipCode) {
        checkoutMap.put("shippingZipCode", shippingZipCode);

    }

    public void setShippingAddress(String shippingAddress) {
        checkoutMap.put("shippingAddress", shippingAddress);

    }
}