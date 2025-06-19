package com.Tokenconf.demo.controller;

import com.Tokenconf.demo.entity.Account;
import com.Tokenconf.demo.payload.AccountDTO;
import com.Tokenconf.demo.service.AccountService;
import com.Tokenconf.demo.util.contants.AccountError;
import com.Tokenconf.demo.util.contants.AccountSuccess;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@Controller
@Slf4j // logger 자동 생성
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/user/signin")
    public ResponseEntity<?> registerUser(@RequestBody AccountDTO accountDTO){ //ResponseEntity로 HTTP 응답 활용
        try {
            Account account = new Account();
            account.setIdName(accountDTO.getIdName());
            account.setPassword(accountDTO.getPassword());
            account.setRole("ROLE_USER");       // 유저 만들기 및 세팅
            accountService.signin(account);     // AccountService의 signin으로 회원가입
            return ResponseEntity.ok(AccountSuccess.ACCOUNT_ADDED.toString());
        } catch (Exception e) {
            log.debug(AccountError.ADD_ACCOUNT_ERROR.toString()+": "+e.getMessage()); // debug level에서 log를 남김
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null); //client에게 패킷에 null을 넣어서 보냄
        }
    }
}
