package com.example.flexcubeinnovation.service.impl;

import com.example.flexcubeinnovation.dto.AccountDto;
import com.example.flexcubeinnovation.entity.Account;
import com.example.flexcubeinnovation.exception.ResourceNotFoundException;
import com.example.flexcubeinnovation.mapper.AccountMapper;
import com.example.flexcubeinnovation.repository.AccountRepository;
import com.example.flexcubeinnovation.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.toEntity(accountDto);
        return AccountMapper.toDto(repository.save(account));
    }

    @Override
    public AccountDto getAccountById(int accountId) {
        Account account = repository.findById(accountId)
            .orElseThrow(() -> new ResourceNotFoundException("Account not found"));
        return AccountMapper.toDto(account);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        return repository.findAll().stream()
            .map(AccountMapper::toDto)
            .toList();
    }

    @Override
    public AccountDto updateAccount(int accountId, AccountDto accountDto) {
        Account account = repository.findById(accountId)
            .orElseThrow(() -> new ResourceNotFoundException("Account not found with id:" + accountId));

        account.setFullName(accountDto.getFullName());
        account.setAccountStatus(accountDto.getAccountStatus());
        account.setAcctOpenDate(accountDto.getAcctOpenDate());
        account.setAvailBal(accountDto.getAvailBal());

        return AccountMapper.toDto(repository.save(account));
    }

    @Override
    public void deleteAccount(int accountId) {
        Account account = repository.findById(accountId)
            .orElseThrow(() -> new ResourceNotFoundException("Account not found"));
        repository.delete(account);
    }
    
}
