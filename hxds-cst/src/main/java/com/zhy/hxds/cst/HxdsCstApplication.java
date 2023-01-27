package com.zhy.hxds.cst;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ServletComponentScan
@MapperScan("com.zhy.hxds.cst.db.dao")
@ComponentScan("com.zhy.*")
@EnableDistributedTransaction
public class HxdsCstApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxdsCstApplication.class, args);
    }

}