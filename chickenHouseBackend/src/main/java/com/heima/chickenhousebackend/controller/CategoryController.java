package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.Category;
import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

    @GetMapping("/loadCategory")
    public Result loadCategory() {
        log.info("获取列表数据");
        List<Category> list = categoryService.List();
        return Result.success(list);
    }

}
