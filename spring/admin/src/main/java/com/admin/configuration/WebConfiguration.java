package com.admin.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer{

	// CORS(cross origin resource sharing)
		// �ٸ� �������� ������ ���� �� �ְ� �Ѵ�.
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*");
        // addMapping("/**") : ���� ��ó ��å�� ���� ���
        // allowedMethods("*") : ��� DDL �޼ҵ带 ���.
    }
}
