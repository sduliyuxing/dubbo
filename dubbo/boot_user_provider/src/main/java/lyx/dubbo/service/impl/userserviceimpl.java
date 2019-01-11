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
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\11 0011 10:44
 */
@com.alibaba.dubbo.config.annotation.Service  //��¶����
@Service
public class userserviceimpl implements userservice {


    @HystrixCommand
    @Override
    public List<useraddress> getbyid(String userid) {
        useraddress address1 = new useraddress(1, "�����в�ƽ���긣�Ƽ�԰�ۺ�¥3��", "1", "����ʦ", "010-56253825", "Y");
        useraddress address2 = new useraddress(2, "�����б�����������ȴ���B��3�㣨���ڷ�У��", "1", "����ʦ", "010-56253825", "N");

        if (Math.random()>0.5){
            throw new RuntimeException();
        }
        return Arrays.asList(address1,address2);
    }
}
