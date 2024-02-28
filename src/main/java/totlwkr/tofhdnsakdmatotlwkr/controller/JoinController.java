package totlwkr.tofhdnsakdmatotlwkr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import totlwkr.tofhdnsakdmatotlwkr.service.JoinService;
import totlwkr.tofhdnsakdmatotlwkr.model.Member;

@Controller
@RequestMapping(value = "/join")
public class JoinController {
    private JoinService joinService;

    @GetMapping(value = "/")
    public String join() {
        return "join/join";
    }

    @GetMapping(value = "/join")
    public String joinForm(Member member) {

        return "index";
    }
}
