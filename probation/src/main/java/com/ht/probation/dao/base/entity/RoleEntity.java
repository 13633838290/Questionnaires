package com.ht.probation.dao.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("Ht_role")
public class RoleEntity {
	@TableField("id")
	@TableId
	private String id;
	@TableField("code")
	private String code;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", code=" + code + "]";
	}
	
}
