package lyx.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Title main
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\11 0011 11:24
 */
@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class,args);
    }
}
