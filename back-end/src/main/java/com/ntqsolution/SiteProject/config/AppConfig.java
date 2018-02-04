package com.ntqsolution.SiteProject.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = { "com.ntqsolution.SiteProject.controller", "com.ntqsolution.SiteProject.bussiness", "com.ntqsolution.SiteProject.repository" })
@EntityScan(basePackages = {"com.ntqsolution.SiteProject.repository.entites"})
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter{
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}
