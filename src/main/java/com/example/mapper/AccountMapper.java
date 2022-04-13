package com.example.mapper;

import com.example.pojo.Account;

import java.util.List;

public interface AccountMapper {

    void insert(Account account);

    List<Account> selectAll();

}
