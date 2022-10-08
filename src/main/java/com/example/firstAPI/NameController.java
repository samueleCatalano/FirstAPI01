package com.example.firstAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getMyName(){
        return "Samuele";
    }

    @PostMapping
    public String postMyReverseName(){
        return "eleumaS";
    }
}
