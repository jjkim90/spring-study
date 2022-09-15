package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/sample/*")
@Log4j2
public class SampleController {
	
	@RequestMapping()
	public void basic() {
		
		log.info("basic......................");
	}

	@GetMapping({"/gloryman", "/gloryman2"})
	public String basicGet2(@RequestParam String name) {
		
		log.info("basic get only get...............................");
		log.info("Name : " + name);
		return "sample/abc";
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info("....................." + dto);
		
		return "ex01";
	}
}
