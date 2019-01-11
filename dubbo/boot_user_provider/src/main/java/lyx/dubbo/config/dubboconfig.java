package lyx.dubbo.config;

import com.alibaba.dubbo.config.*;
import lyx.dubbo.service.userservice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title dubboconfig
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\11 0011 10:56
 */

//@Configuration
public class dubboconfig {

//    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-provider");
        return applicationConfig;
    }

    //<dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"></dubbo:registry>
//    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    //<dubbo:protocol name="dubbo" port="20882"></dubbo:protocol>
//    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20881);
        return protocolConfig;
    }

    /**
     *<dubbo:service interface="com.atguigu.gmall.service.UserService"
     ref="userServiceImpl01" timeout="1000" version="1.0.0">
     <dubbo:method name="getUserAddressList" timeout="1000"></dubbo:method>
     </dubbo:service>
     */
//    @Bean
    public ServiceConfig<userservice> userServiceConfig(userservice userService){
        ServiceConfig<userservice> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(userservice.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("1.0.0");

        //配置每一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);

        //将method的设置关联到service配置中
        List<MethodConfig> methods = new ArrayList<>();
        methods.add(methodConfig);
        serviceConfig.setMethods(methods);

        //ProviderConfig
        //MonitorConfig

        return serviceConfig;
    }
}
