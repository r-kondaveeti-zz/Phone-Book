package com.phonebook.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This class is just like web.xml that includes dispatcher servlet registration,
 * common beans, etc.
 * @author Radhithya
 *
 */
public class PPMAppDispatcherServletInitializer
	extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SpringRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	/*
	 * This is mandatory. don't forget to implement
	 */
	@Override
	public void onStartup(ServletContext servletContext)throws ServletException{
		super.onStartup(servletContext);
	}
}