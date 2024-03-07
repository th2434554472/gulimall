package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author restia
 * @email th2434554472@gmail.com
 * @date 2024-03-07 16:48:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
