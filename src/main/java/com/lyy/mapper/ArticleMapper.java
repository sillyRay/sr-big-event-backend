package com.lyy.mapper;

import com.lyy.pojo.Article;
import com.lyy.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    //新增
    @Insert("insert into article(title,content,cover_img,state,category_id,create_user,create_time,update_time) " +
            "values(#{title},#{content},#{coverImg},#{state},#{categoryId},#{createUser},#{createTime},#{updateTime})")
    void add(Article article);

    List<Article> list(Integer userId, Integer categoryId, String state);

    @Select("select * from article where id = #{id}")
    Article findById(Integer id);

    @Delete("delete from article where id = #{id}")
    void deleteById(Integer id);

    //更新
    @Update("update article set title=#{title},content=#{content},cover_img=#{coverImg},state=#{FileUploadControllerstate},category_id=#{categoryId},update_time=#{updateTime} where id=#{id}")
    void update(Article article);
}
