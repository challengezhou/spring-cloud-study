package priv.zujool.springcloudstudy.controller;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import priv.zujool.springcloudstudy.service.UserService;


@RestController
public class TestController {

    @DubboReference
    private UserService userService;

    @GetMapping("/testDubboGet")
    public String testRpcGet(String param) {
        return userService.testDubboGet(param);
    }

}
