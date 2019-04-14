package lyx.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 1������������
 * 		1��������dubbo-starter
 * 		2��������dubbo����������
 * @author lfy
 *
 * SpringBoot��dubbo���ϵ����ַ�ʽ��
 * 1��������dubbo-starter����application.properties�������ԣ�ʹ��@Service����¶����ʹ��@Reference�����÷���
 * 2��������dubbo xml�����ļ�;
 * 		����dubbo-starter��ʹ��@ImportResource����dubbo�������ļ�����
 * 3����ʹ��ע��API�ķ�ʽ��
 * 		��ÿһ������ֶ�������������,��dubbo��ɨ�����������
 */


@EnableDubbo //��������ע���dubbo����
//@ImportResource(locations="classpath:provider.xml")
@EnableHystrix
@SpringBootApplication
public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class,args);
    }
}
