package com.Tokenconf.demo.service;

import com.Tokenconf.demo.entity.Account;
import com.Tokenconf.demo.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;


    public Account signin(Account account) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        if(account.getRole() == null) {
            account.setRole("ROLE_USER");
        }
        return accountRepository.save(account);
    }

    /*public void sameUser(Account account) {
        accountRepository.findByidName(account.getIdName().isPresent(m -> {
                throw new IllegalStateException("이미 사용중인 이름입니다.");
            })
        );
    }*/
    public boolean existsByIdName (String idName) {
        return !AccountRepository.existsByIdName(idName);
    }
}
