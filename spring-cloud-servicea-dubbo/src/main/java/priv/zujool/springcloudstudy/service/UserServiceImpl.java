package priv.zujool.springcloudstudy.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService{
    @Override
    public String testDubboGet(String param) {
        return "dubbo get " + param;
    }
}
