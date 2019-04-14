package lyx.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lyx.dubbo.bean.useraddress;
import lyx.dubbo.service.orderservice;
import lyx.dubbo.service.userservice;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Title orderserviceimpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\11 0011 11:07
 */

@Service
public class orderserviceimpl implements orderservice{


    @Reference(loadbalance = "random",timeout = 1000)
    private userservice userservice;

    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<useraddress> initorder(String userid) {
        System.out.println(userid);
        List<useraddress> list = userservice.getbyid(userid);
        return list;
    }

    public List<useraddress> hello(String userid) {
        return Arrays.asList(new useraddress(10, "测试地址", "1", "测试", "测试", "Y"));

    }
}
