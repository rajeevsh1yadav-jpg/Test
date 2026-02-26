package com.example.flexcubeinnovation.mapper;

import com.example.flexcubeinnovation.entity.Account;
import com.example.flexcubeinnovation.dto.AccountDto;

public class AccountMapper {
    public static AccountDto toDto(Account account) {
        AccountDto dto = new AccountDto();
        dto.setAccountId(account.getAccountId());
        dto.setFullName(account.getFullName());
        dto.setAccountStatus(account.getAccountStatus());
        dto.setAcctOpenDate(account.getAcctOpenDate());
        dto.setAvailBal(account.getAvailBal());
        return dto;
    }
    public static Account toEntity(AccountDto dto) {
        Account account = new Account();
        account.setAccountId(dto.getAccountId());
        account.setFullName(dto.getFullName());
        account.setAccountStatus(dto.getAccountStatus());
        account.setAcctOpenDate(dto.getAcctOpenDate());
        account.setAvailBal(dto.getAvailBal());
        return account;
    }
}
