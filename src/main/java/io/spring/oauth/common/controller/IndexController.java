package io.spring.oauth.common.controller;

import io.spring.oauth.config.auth.LoginUser;
import io.spring.oauth.config.auth.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {
    @GetMapping("/")
    public String index(final Model model, @LoginUser final SessionUser user) {
        if (user != null) model.addAttribute("userName", user.getName());
        return "index";
    }
}
