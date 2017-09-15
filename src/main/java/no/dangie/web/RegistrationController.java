package no.dangie.web;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/registration")
    public void registration(@RequestParam String userName, @RequestParam String password) {
        System.out.println("userName: " + userName + " , passwor: " + password );

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String hashedPassword = passwordEncoder.encode(password);

        System.out.println("userName: " + userName + " , passwor: " + hashedPassword );
    }

}
