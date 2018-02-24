package top.klovis.httpsservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${test.first}")
    private int testFirst;

    @Value("${test.second}")
    private int testSecond;

    @PostMapping("/alive")
    @ResponseBody
    public boolean isPostServiceAlive() {
        System.out.println("[testFirst] " + testFirst);
        return true;
    }

    @GetMapping("/alive")
    @ResponseBody
    public boolean isGetServiceAlive() {
        System.out.println("[testSecond] " + testSecond);
        return true;
    }
}
