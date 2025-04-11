package com.cheng.banking.service;

import com.cheng.banking.dto.BankResponse;
import com.cheng.banking.dto.UserRequest;

public interface UserService {
BankResponse createAccount(UserRequest request);

BankResponse getAccountInfo(String accountNumber);

// BankResponse getAllAccounts();

// BankResponse updateAccount(String accountNumber, UserRequest request);

// BankResponse deleteAccount(String accountNumber);
// BankResponse getAccountByStatus(String status);
    
}
