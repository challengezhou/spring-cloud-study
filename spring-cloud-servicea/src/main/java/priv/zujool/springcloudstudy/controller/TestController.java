package priv.zujool.springcloudstudy.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {

    @GetMapping("/testGet")
    public String testGet(String param){
        return "ok, 我是中文; params=" + param;
    }

    @PostMapping("/testPost")
    public RequestBodyEntity testPost(@RequestBody RequestBodyEntity entity) {
        return entity;
    }

}
