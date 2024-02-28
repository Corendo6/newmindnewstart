package com.tofhdnsakdmatotlwkr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tofhdnsakdmatotlwkr.model.Member;
import com.tofhdnsakdmatotlwkr.service.JoinService;

@Controller
@RequestMapping(value = "/join")
public class JoinController {
    private final JoinService joinService;

    @Autowired
    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @GetMapping(value = "/")
    public String join() {
        return "join/join";
    }

    @GetMapping(value = "/join")
    public String joinForm(Member member) {
        int result = joinService.join(member);

        String url = "redirect:";
        if (result == 1) {
            url = url + "/";
        } else if (result == 0) {
            url = url + "/error";
        }

        return url;
    }
}
