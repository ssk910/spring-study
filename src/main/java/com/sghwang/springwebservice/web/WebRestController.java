package com.sghwang.springwebservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController annotation은 클래스의 모든 메소드에
 * @ResponseBody를 적용시켜준다.
 */

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
