package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author restia
 * @email th2434554472@gmail.com
 * @date 2024-03-07 16:33:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}