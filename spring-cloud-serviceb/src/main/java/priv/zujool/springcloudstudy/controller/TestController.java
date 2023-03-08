package priv.zujool.springcloudstudy.controller;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;


@AllArgsConstructor
@RestController
public class TestController {

    private final RestTemplate restTemplate;

    @GetMapping("/testGet")
    public String testGet(String param){
        return "ok, 我是中文; params=" + param;
    }

    @PostMapping("/testPost")
    public RequestBodyEntity testPost(@RequestBody RequestBodyEntity entity) {
        return entity;
    }

    @GetMapping("/testRpcGet")
    public String testRpcGet(String param) {
        return restTemplate.getForObject("http://spring-cloud-servicea/testGet?param=" + param, String.class);
    }

    @GetMapping("/testRpcPost")
    public RequestBodyEntity testRpcPost() {
        System.currentTimeMillis();
        return restTemplate.postForObject("http://spring-cloud-servicea/testPost",
                new RequestBodyEntity("a", "b"), RequestBodyEntity.class);
    }

}
