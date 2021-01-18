package com.ht.probation;

import java.util.List;

public class BeanParam {
	private String param1;
	private String param2;
	private List<BeanParam> paramList;
	
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public List<BeanParam> getParamList() {
		return paramList;
	}
	public void setParamList(List<BeanParam> paramList) {
		this.paramList = paramList;
	}
	
}
