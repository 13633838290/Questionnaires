package com.ht.probation.web.base;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/base")
public class BaseController {

	/**
	 * 获取业务线
	 * @return
	 */
	@RequestMapping("/bussLine")
	public List<OptionBean> bussLine() {
		return null;
	}

	/**
	 * 获取部门
	 * @param bussId 业务线id
	 * @return
	 */
	@RequestMapping("/depts")
	public List<OptionBean> depts(String bussId) {
		return null;
	}

	/**
	 * 获取交付部
	 * @param deptid 部门id
	 * @return
	 */
	@RequestMapping("/delivers")
	public List<OptionBean> delivers(String deptid) {
		return null;
	}

	/**
	 * 获取项目
	 * @param deptid 交付部id
	 * @return
	 */
	@RequestMapping("/projects")
	public List<OptionBean> projects(String deliverId) {
		return null;
	}
}
