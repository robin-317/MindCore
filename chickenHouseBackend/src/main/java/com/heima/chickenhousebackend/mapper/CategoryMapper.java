package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

    //获取列表数据
    @Select("select category_id,category_code,category_name,p_category_id from category")
    List<Category> getList();
}
