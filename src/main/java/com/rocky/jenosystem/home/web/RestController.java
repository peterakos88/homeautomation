package com.rocky.jenosystem.home.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rocky.jenosystem.home.entity.Person;

/**
 * RestController will be used along with jackson to provide a easy to use rest interface for
 * the different interfaces that we'use e.g Mobile. This way, we don't have to support a heavy
 * complex web service for the needs of homeautomation project. Simple rest accessible calls
 * are more than enough for communication with the outside-world.
 */
@Controller  
@RequestMapping(value = "/rest")
public class RestController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	
	/** Example that shows how jackson works. If method is response body and jackson is found on the classpath
	 *  Spring converts the response body object to json automatically. **/
	
	@ResponseBody
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public Person getJson(){
		logger.debug("getJson()");
		Person t = new Person();
		t.setName("peter");
		t.setSurname("savidis");
		return t;
	}
	
}