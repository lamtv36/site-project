package com.ntqsolution.SiteProject.controller.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntqsolution.SiteProject.constant.APIManager;

@RestController
@RequestMapping(APIManager.DASHBOARD)
public class DashboardAPI extends BaseAPI{

}
