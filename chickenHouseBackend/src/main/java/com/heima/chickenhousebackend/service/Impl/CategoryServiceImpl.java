package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.CategoryMapper;
import com.heima.chickenhousebackend.pojo.Category;
import com.heima.chickenhousebackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> List() {
        return categoryMapper.getList();
    }
}
