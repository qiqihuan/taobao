package com.user.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *  用户权限管理系统的启动类
 * </p>
 *
 * @author:wells
 * @since:2020/9/1
 */
@SpringBootApplication
@MapperScan("com.project.account.mapper")
public class startUser {

    public static void main(String[] args) {
        System.out.println("启动类");
        SpringApplication.run(startUser.class);
    }
}
