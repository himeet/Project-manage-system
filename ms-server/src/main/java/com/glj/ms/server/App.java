package com.glj.ms.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName App
 * @Description
 *
 * 项目全局启动类
 *
 * @Author glj
 * @Date 2022/5/6 9:20 下午
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = {"${ms.info.base-package}.server", "${ms.info.base-package}.module"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
