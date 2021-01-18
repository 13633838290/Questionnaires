package com.ht.probation.dao.base;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ht.probation.dao.base.entity.RoleEntity;

@Mapper
public interface RoleDao extends BaseMapper<RoleEntity> {

}
