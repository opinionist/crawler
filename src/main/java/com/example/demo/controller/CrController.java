package com.example.demo.controller;

import com.example.demo.dto.Product;
import com.example.demo.service.CrService;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.devtools.SeleniumCdpConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cr")
public class CrController {
    private final CrService crService;

    @GetMapping("/test")
    public List<Product> test(@RequestParam String keyword, @RequestParam(defaultValue = "1") int page) {
        try {
            return crService.getShoppingData(keyword, page);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
