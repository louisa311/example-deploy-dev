package example.deploy.dev.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Test {

    @GetMapping("/welcoming/to-the-world")
    public String testHelloWorld() {
        return "GOOD JOB LOUISA!!!";
    }
}
