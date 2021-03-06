package com.jenson.ecommerce.dao;

import com.jenson.ecommerce.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品属性Dao
 *
 */
public interface PmsProductAttributeDao {
    /**
     * 获取商品分类对应属性列表
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
