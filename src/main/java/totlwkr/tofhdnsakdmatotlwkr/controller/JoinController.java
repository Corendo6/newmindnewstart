package totlwkr.tofhdnsakdmatotlwkr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import totlwkr.tofhdnsakdmatotlwkr.Service.JoinService;

@Controller
@RequestMapping(value = "/join")
public class JoinController {
    private JoinService joinService;

    @GetMapping(value = "/")
    public String join() {
        return "join/join";
    }
}
