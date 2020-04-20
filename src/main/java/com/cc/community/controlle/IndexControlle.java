package com.cc.community.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexControlle {

    @GetMapping("/")
    public String index(){ return  "index"; }
}
