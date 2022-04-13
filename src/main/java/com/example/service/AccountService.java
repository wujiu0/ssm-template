package com.example.service;

import com.example.pojo.Account;

import java.util.List;

public interface AccountService {

    void insert(Account account);

    List<Account> selectAll();
}
