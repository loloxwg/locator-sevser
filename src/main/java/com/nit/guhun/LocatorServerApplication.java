package com.nit.guhun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan({"com.nit.guhun.mapper"})
// 测试时开启↓↓↓↓↓↓↓↓↓↓
//public class LocatorServerApplication {
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(LocatorServerApplication.class, args);
//	}
//
//}
// 测试时开启↑↑↑↑↑↑↑↑↑↑
// 部署时开启↓↓↓↓↓↓↓↓↓↓
public class LocatorServerApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LocatorServerApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(LocatorServerApplication.class, args);
    }
}
// 部署时开启↑↑↑↑↑↑↑↑↑↑