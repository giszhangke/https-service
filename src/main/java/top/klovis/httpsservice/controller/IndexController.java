package top.klovis.httpsservice.controller;

import org.springframework.beans.factory.annotation.Value;
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
    public boolean isServiceAlive() {
        System.out.println("[testFirst] " + testFirst);
        System.out.println("[testSecond] " + testSecond);
        return true;
    }
}
