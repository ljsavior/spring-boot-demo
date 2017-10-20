package com.eternal.com.eternal.web.controller;

import com.eternal.com.eternal.service.DemoService;
import com.eternal.entity.Demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private DemoService demoService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model) {
        List<Demo> demoList = demoService.findAll();
        model.addAttribute("message", "hello world");
        model.addAttribute("demoList", demoList);
        return "demoList";
    }

}
