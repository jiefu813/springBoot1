package com.jeff.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

@Configuration
public class MybatisPlusConfig {

	/**
	 * mybatis-plus分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

}
