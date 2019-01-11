package lyx.dubbo.service;

import lyx.dubbo.bean.useraddress;

import java.util.List;

/**
 * @Title userservice
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\10 0010 16:35
 */
public interface userservice {

    public List<useraddress> getbyid(String userid);
}
