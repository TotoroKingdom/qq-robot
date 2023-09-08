package com.totoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: totoro
 * @createDate: 2023 09 08 22 52
 * @description:
 **/
@RestController
public class AppleController {

    @GetMapping("apple")
    public String appleTest(){
        return "apple";
    }
}
