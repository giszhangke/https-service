package top.klovis.httpsservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @PostMapping("/alive")
    @ResponseBody
    public boolean isServiceAlive() {
        return true;
    }
}
