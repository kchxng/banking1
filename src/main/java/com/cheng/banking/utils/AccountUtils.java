package com.cheng.banking.utils;

import java.time.Year;

public class AccountUtils {
    /*
     * 2025 + ramdomSixDigits
     */
    Year currentYear = Year.now();
    int min = 100000;
    int max = 999999;

    // Generate a random 6-digit number between min and max
    int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
    // Convert the current and random number to a string
    String year = String.valueOf(currentYear);
    String randomNumber = String.valueOf(randNumber);
    StringBuilder accountNumber = new StringBuilder();

    public static String generateAccountNumber() {
        /*
         * 2025 + ramdomSixDigits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        // Generate a random 6-digit number between min and max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        // Convert the current and random number to a string
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        accountNumber.append(year).append(randomNumber);
        return accountNumber.toString();
    }
}
