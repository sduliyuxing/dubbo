package lyx.dubbo.controller;

import lyx.dubbo.bean.useraddress;
import lyx.dubbo.service.orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Title ordercontroller
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\11 0011 11:29
 */

@Controller
public class ordercontroller {

    @Autowired
    private orderservice orderservice;

    @ResponseBody
    @RequestMapping("/init")
    public List<useraddress> get(@RequestParam("userid") String userid){
        List<useraddress> list = orderservice.initorder(userid);
        return list;
    }

}
