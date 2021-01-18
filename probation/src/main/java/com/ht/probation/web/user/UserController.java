package com.ht.probation.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ht.probation.web.bean.CommonResutBean;

@Controller
@RequestMapping("/user")
public class UserController {

	public CommonResutBean login() {
		return null;
	}
	
	public CommonResutBean register(@ModelAttribute UserBean userBean) {
		return null;
	}
}
