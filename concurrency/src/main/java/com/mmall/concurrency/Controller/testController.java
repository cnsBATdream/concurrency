package com.mmall.concurrency.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class testController {
    @RequestMapping("/test")
    @ResponseBody
    public String test () {
        return "test";
    }

}
