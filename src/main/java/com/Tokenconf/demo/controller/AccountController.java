package com.Tokenconf.demo.controller;

import com.Tokenconf.demo.entity.Account;
import com.Tokenconf.demo.payload.AccountDTO;
import com.Tokenconf.demo.service.AccountService;
import com.Tokenconf.demo.util.contants.AccountSuccess;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class AccountController {

    private final AccountService accountService;


}
