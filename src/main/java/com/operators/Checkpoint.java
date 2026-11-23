package com.operators;

public class Checkpoint {
        public static void main(String[] args) {

            // Входные данные
            String dish = "SHAWARMA_XL";
            int qty = 2;
            int minutesToClose = 18;

            // Шаг 1. unitPrice
            int unitPrice;
            String ORDER = dish;

            unitPrice = switch (ORDER) {
                case "SHAWARMA_CLASSIC" -> 220;
                case "SHAWARMA_XL" -> 320;
                case "FALAFEL" -> 180;
                case "DRINK" -> 90;
                default ->  0;
            };

            // Шаг 2. subtotal, discountPercent, total
            int discountPercent = 0;

            int subtotal = unitPrice * qty;

            if (subtotal >= 2000) {
                discountPercent = 15;
            } else if (subtotal >= 1000) {
                discountPercent = 10;
            } else if (subtotal >= 500) {
                discountPercent = 5;
            } else if (subtotal < 500) {
                discountPercent = 0;
            }

            int total = subtotal - subtotal * discountPercent / 100;

            // Шаг 3. batch
            String batch = (qty <= 1) ? "single":
                           (qty <= 5) ? "small batch" :"big batch";

            // Шаг 4. kitchenAction
            String kitchenAction;

           if (minutesToClose <= 0) {
               kitchenAction = "kitchen closed - reject";
           } else {
               kitchenAction = switch (ORDER) {
                   case "SHAWARMA_CLASSIC" -> "grill 4 min";
                   case "SHAWARMA_XL" -> "grill 7 min";
                   case "FALAFEL" -> "fry 5 min";
                   case "DRINK" -> "pour & serve";
                   default ->  "manual check";
               };
           }

            // Шаг 5. печать чека
            System.out.println("[ORDER]" + "   " + dish + " " + "x" + qty);
            System.out.println("[PRICE]" + "   " + subtotal + " -> " + total + " " + "(-" +discountPercent +"%)");
            System.out.println("[BATCH]" + "   " + batch);
            System.out.println("[KITCHEN]" + " " + kitchenAction);
            System.out.println("[CLOSE]" + "   " + minutesToClose + " " + "min left");
        }
}
