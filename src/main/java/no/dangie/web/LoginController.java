package no.dangie.web;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public void login(@RequestParam String userName, @RequestParam String password) {

        String savedPW = "yo123";

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        CharSequence cs = password;

        boolean b = passwordEncoder.matches(cs, passwordEncoder.encode(savedPW));

        System.out.println(b);
    }

}
