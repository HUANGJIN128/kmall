package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Kim
 * @email 17610823929.com
 * @date 2022-10-12 19:51:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
