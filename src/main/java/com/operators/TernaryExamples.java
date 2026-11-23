package com.operators;

public class TernaryExamples {
    public static void main(String[] args) {
        String env = "TEST";
        String baseUrl = env.equals("PROD") ? "google.com" : "yahoo.com";
        System.out.println(baseUrl);

        double rawTotal = 199.99;

    }
}
