package com.hs.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author 华生
 * 2020 11/11
 */
@EnableOpenApi
@SpringBootApplication
@MapperScan(basePackages = {"mapper","com.hs.store.mapper"})
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

}
