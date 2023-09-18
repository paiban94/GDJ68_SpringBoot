package com.example.sample.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	//index페이지로 가기위한 메서드
	@GetMapping("/")//("/")주소가 들어오면 실행하겠다
	@ResponseBody // json으로 사용한다
	public String getIndex() {
		return "index";
	}
}
