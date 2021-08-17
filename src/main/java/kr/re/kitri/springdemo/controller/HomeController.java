package kr.re.kitri.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "hello world";
    }

    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요";
    }

    // GET: /greet --> 반갑습니다.
    @GetMapping("/greet")
    public String greet() {
        return "반갑습니다.";
    }
    // GET: /greet/again --> 다시 만나 반갑습니다.
    @GetMapping("/greet/again")
    public String greetAgain() {
        return "다시 만나 반갑습니다.";
    }
}
