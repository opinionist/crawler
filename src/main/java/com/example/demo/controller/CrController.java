package com.example.demo.controller;

import com.example.demo.service.CrService;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.devtools.SeleniumCdpConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cr")
public class CrController {
    private final CrService crService;

    @GetMapping("/test")
    public String test() {
        return "CR Controller is working!";
        }
}
