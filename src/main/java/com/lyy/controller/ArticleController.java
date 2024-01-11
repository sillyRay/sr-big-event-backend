package com.lyy.controller;

/*
import com.lyy.pojo.Article;
import com.lyy.pojo.PageBean;
import com.lyy.pojo.Result;
import com.lyy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

 */

import com.lyy.pojo.Article;
import com.lyy.pojo.Category;
import com.lyy.pojo.PageBean;
import com.lyy.pojo.Result;
import com.lyy.service.ArticleService;
import com.lyy.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result add(@RequestBody @Validated Article article) {
        articleService.add(article);
        return Result.success();
    }

    @GetMapping
    public Result<PageBean<Article>> list(
            Integer pageNum,
            Integer pageSize,
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false) String state
    ) {
       PageBean<Article> pb =  articleService.list(pageNum,pageSize,categoryId,state);
       return Result.success(pb);
    }

    @GetMapping("/detail")
    public Result<Article> detail(Integer id){
        Article c = articleService.findById(id);
        return Result.success(c);
    }

    @DeleteMapping
    public Result delete(Integer id){
        articleService.deleteById(id);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody @Validated(Article.Update.class) Article article){
        articleService.update(article);
        return Result.success();
    }
}
