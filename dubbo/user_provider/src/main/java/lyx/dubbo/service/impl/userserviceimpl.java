package lyx.dubbo.service.impl;

import lyx.dubbo.bean.useraddress;
import lyx.dubbo.service.userservice;

import java.util.Arrays;
import java.util.List;

/**
 * @Title userserviceimpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\10 0010 16:49
 */
public class userserviceimpl implements userservice {


    @Override
    public List<useraddress> getbyid(String userid) {
        useraddress address1 = new useraddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        useraddress address2 = new useraddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}
