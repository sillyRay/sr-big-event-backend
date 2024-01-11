package com.lyy.service;

import com.lyy.pojo.Article;
import com.lyy.pojo.PageBean;
//import com.lyy.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);

    //获取文章详情
    Article findById(Integer id);

    //删除文章
    void deleteById(Integer id);

    //更新文章
    void update(Article article);
}
