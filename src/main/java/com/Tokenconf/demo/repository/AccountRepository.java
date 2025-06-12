package com.Tokenconf.demo.repository;

import com.Tokenconf.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository                     // <Account, Long>: Account Entity를 다루는 Repository, Account Entity의 PK가 Long Type이라는 것을 명시
public interface AccountRepository extends JpaRepository<Account, Long> {
    public Optional<Account> findByidName (String idName);
}
