package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author restia
 * @email th2434554472@gmail.com
 * @date 2024-03-07 17:14:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
