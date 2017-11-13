package com.mob.springboot.bootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//告诉spri以字符串的形式渲染结果，并且直接返回给调用者
@RestController
@EnableAutoConfiguration
public class BootApp {

	@RequestMapping("/")			//提供路由信息,告诉Spring任何来自"/"路径的HTTP请求都应该被映射到 home 方法
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}
}
