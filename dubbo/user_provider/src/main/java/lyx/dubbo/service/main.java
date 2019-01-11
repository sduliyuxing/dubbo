package lyx.dubbo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Title main
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\10 0010 17:34
 */
public class main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context=new ClassPathXmlApplicationContext("provider.xml");
        ((ClassPathXmlApplicationContext) context).start();
        System.out.println("生产者启动");
        while (true){
        }
    }
}
