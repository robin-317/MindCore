package com.heima.chickenhousebackend.pojo;

public class Category {
    private Integer categoryId;      // 列表id
    private String categoryCode;     // 列表英文名 - 路径后缀
    private String categoryName;     // 列表名
    private Integer pCategoryId;     // 父列表的id值

    public Category() {

    }

    public Category(Integer categoryId, String categoryCode, String categoryName, Integer pCategoryId) {
        this.categoryId = categoryId;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.pCategoryId = pCategoryId;
    }

    /**
     * 获取
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * 设置
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * 获取
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获取
     * @return pCategoryId
     */
    public Integer getPCategoryId() {
        return pCategoryId;
    }

    /**
     * 设置
     * @param pCategoryId
     */
    public void setPCategoryId(Integer pCategoryId) {
        this.pCategoryId = pCategoryId;
    }

    public String toString() {
        return "Category{categoryId = " + categoryId + ", categoryCode = " + categoryCode + ", categoryName = " + categoryName + ", pCategoryId = " + pCategoryId + "}";
    }
}
