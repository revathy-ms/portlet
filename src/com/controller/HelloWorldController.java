package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.portlet.ModelAndView;
//import org.springframework.web.portlet.mvc.Controller;
import org.springframework.web.portlet.mvc.AbstractController;


public class HelloWorldController extends AbstractController{
    @Override
	public ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response){

		EmployeeMain e1=new EmployeeMain();
		ArrayList<EmployeeData> elist=e1.getElist();
		ModelAndView mv = new ModelAndView("helloWorld", "edata", elist);
		return mv;
	}

}
