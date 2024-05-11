package com.bj.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{DataSourceJavaConfig.class,MybatisJavaConfig.class,ServiceJavaConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{WebMvcJavaConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
