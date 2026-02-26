package com.example.flexcubeinnovation.service;

import com.example.flexcubeinnovation.dto.AccountDto;
import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(int accountId);
    List<AccountDto> getAllAccounts();
    AccountDto updateAccount(int accountId, AccountDto accountDto);
    void deleteAccount(int accountId);
}
