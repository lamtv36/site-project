package com.ntqsolution.SiteProject.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import com.ntqsolution.SiteProject.bussiness.mapper.IMapper;

public abstract class BaseBus<Entity, VO> {
	@Autowired
	protected IMapper<Entity, VO> mapper;
	@Autowired
	private MessageSource messageSource;
	
	public BaseBus(){
		
	}
	
	public String getMessage(String message) {
		return messageSource.getMessage(message, null, LocaleContextHolder.getLocale());
	}
	
	public String getMessage(String message, Object [] args) {
		return messageSource.getMessage(message, args, LocaleContextHolder.getLocale());
	}
}
