package lyx.dubbo.service.impl;

import lyx.dubbo.bean.useraddress;
import lyx.dubbo.service.orderservice;
import lyx.dubbo.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title orderserviceimpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\10 0010 16:57
 */
@Service
public class orderserviceimpl implements orderservice {

    @Autowired
    private userservice userservice;

    @Override
    public List<useraddress> initorder(String userid) {
        System.out.println(userid);
        List<useraddress> list = userservice.getbyid(userid);
        System.out.println(list);
        return list;
    }
}
