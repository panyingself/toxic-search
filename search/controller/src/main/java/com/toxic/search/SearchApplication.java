/*
 *
 *  * Copyright (c) 2019. tdc.shangri-la.com. All Rights Reserved.
 *
 */

package com.toxic.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author py
 * @date 2018/11/25 10:17 PM.
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.toxic.search.service.repository")
public class SearchApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

    /**
     * 为了打包springboot项目
     *
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}
