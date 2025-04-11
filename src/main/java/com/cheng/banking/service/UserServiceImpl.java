package com.cheng.banking.service;

import com.cheng.banking.dto.BankResponse;
import com.cheng.banking.dto.UserRequest;
import com.cheng.banking.entity.User;

public class UserServiceImpl implements UserService {

    @Override
    public BankResponse createAccount(UserRequest request) {
        // Create an account - saving new user info to db
        // TODO Auto-generated method stub
        User newUser=User.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .otherName(request.getOtherName())
        .gender(request.getGender())
        .address(request.getAddress())
        .stateOfOrigin(request.getStateOfOrigin())
        .accountNumber(request.getAccountNumber())
        .build();
        // newUser.setFirstName(request.getFirstName());
        // newUser.setLastName(request.getLastName());
        // newUser.setOtherName(request.getOtherName());
        // newUser.setGender(request.getGender());
        // newUser.setAddress(request.getAddress());
        // newUser.setStateOfOrigin(request.getStateOfOrigin());
        // newUser.setEmail(request.getEmail());
        // newUser.setPhoneNumber(request.getPhoneNumber());
        // newUser.setAlternativePhoneNumber(request.getAlternativePhoneNumber());
        // newUser.setStatus(request.getStatus());
        // newUser.setAccountNumber("1234567890");
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }

    @Override
    public BankResponse getAccountInfo(String accountNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAccountInfo'");
    }

    
}
