package com.cos.jwtex01.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.jwtex01.config.auth.LoginUser;
import com.cos.jwtex01.config.auth.Principal;

@RestController
public class TestController {
	
	@Autowired
	private NaverService naverService;
	
	// 유저 혹은 어드민이 접근 가능
	@GetMapping("/search")
	public String user() {
		//System.out.println("principal : "+principal.getUsername());
		
		NaverService.main(null);
		
		return "연결완료";
	}	
}











