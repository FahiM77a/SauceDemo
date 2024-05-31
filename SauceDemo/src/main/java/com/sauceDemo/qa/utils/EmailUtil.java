package com.sauceDemo.qa.utils;

import java.util.UUID;

public class EmailUtil {
    public static String DOMAIN = "example.com";
    public static String generateUniqueEmail(){
        String uniqueID = UUID.randomUUID().toString().substring(0,8);
        return "user_"+uniqueID+"@"+DOMAIN;
    }

}
