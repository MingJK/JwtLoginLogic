package com.Tokenconf.demo.controller;

import com.Tokenconf.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
}
