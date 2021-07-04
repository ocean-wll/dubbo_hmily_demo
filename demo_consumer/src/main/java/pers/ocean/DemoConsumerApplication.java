package pers.ocean;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import pers.ocean.service.AService;
import pers.ocean.service.BService;

@SpringBootApplication
public class DemoConsumerApplication {

    @DubboReference(version = "1.0.0")
    private AService aService;

    @DubboReference(version = "1.0.0")
    private BService bService;

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }


    /**
     * ApplicationRunner 或者 CommandLineRunner 都是在spring boot 容器启动以后执行任务
     */
    @Bean
    public ApplicationRunner runner() {

        return args -> {
            aService.deal();
            bService.deal();
        };
    }

}
