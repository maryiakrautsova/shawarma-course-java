package com.strings;

public class Theory {
    public static void main(String[] args) {
        String actual = "NEW";
        String expected = "NEW";

        System.out.println(actual.equals(expected));
        System.out.println("admin".equalsIgnoreCase("ADMIN"));

        String url = "http://localhost:8080/api/orders/42";
        System.out.println(url.contains("x"));

        url = url.toUpperCase();
        System.out.println(url);

        int urlLength = url.length();
        System.out.println(urlLength);
    }
}
