package lyx.dubbo.service.impl;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lyx.dubbo.bean.useraddress;
import lyx.dubbo.service.userservice;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Title userserviceimpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\11 0011 10:44
 */
@com.alibaba.dubbo.config.annotation.Service  //暴露服务
@Service
public class userserviceimpl implements userservice {


    @HystrixCommand
    @Override
    public List<useraddress> getbyid(String userid) {
        useraddress address1 = new useraddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        useraddress address2 = new useraddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");

        if (Math.random()>0.5){
            throw new RuntimeException();
        }
        return Arrays.asList(address1,address2);
    }
}
