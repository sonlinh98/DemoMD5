package com.example.md5.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/demo")
public class Demo {
    
    @GetMapping("/md5")
    public static ResponseEntity<ResultMD5> DemoMD5(@RequestParam String input) {
        ResultMD5 resultMD5 = new ResultMD5();
        resultMD5.setInput(input);
        resultMD5.setResult(MyMD5.generator(input));
        return ResponseEntity.ok().body(resultMD5);
    }
}
