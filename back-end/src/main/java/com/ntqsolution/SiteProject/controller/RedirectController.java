package com.ntqsolution.SiteProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ntqsolution.SiteProject.constant.APIManager;

@Controller
@RequestMapping
public class RedirectController {
	
	@GetMapping(APIManager.DASHBOARD)
	public String dashboard() {
		return "dashboard";
	}
	
	@GetMapping(APIManager.MEETING)
	public String meeting() {
		return "meeting";
	}
	
	@GetMapping(APIManager.PROFILE)
	public String profile() {
		return "profile";
	}
	
	@GetMapping(APIManager.SCHEDULES)
	public String schedule() {
		return "schedule";
	}
	
	@GetMapping(APIManager.TOPICS)
	public String topics() {
		return "topic";
	}
	
	@GetMapping(APIManager.USERS)
	public String users() {
		return "users";
	}
}
