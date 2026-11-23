package com.operators;

public class SwitchExamples {
    public static void main(String[] args) {
        String baseUrl = "";
        String env = "STAGE";

        baseUrl = switch (env) {
            case "LOCAL" -> "localhost:8080";
            case "PROD" -> "google.com";
            case "STAGE" -> "yahoo.com";
            default -> baseUrl;
        };
        System.out.println(baseUrl);
    }
}
