package com.jt.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppWebInitializer 
   extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{AppRootConfig.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{AppServletConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.do"};
	}
}
