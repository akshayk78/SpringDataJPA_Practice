package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class confi implements WebMvcConfigurer {

	
	//set As welcome Page in boot
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
			
			registry.addViewController("/").setViewName("/index.jsp");
			registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}

	
	
}
