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
 * @Create 2019\1\10 0010 17:59
 */
public class main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        orderservice orderservice = context.getBean(orderservice.class);
        System.out.println("消费者启动");
        orderservice.initorder("1");
        while (true) {
        }
    }
}
