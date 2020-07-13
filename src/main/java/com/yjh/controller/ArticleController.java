package com.yjh.controller;

import com.yjh.pojo.Article;
import com.yjh.service.ArticleService;
import com.yjh.util.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/article")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getAll")
    private ResultVo getAll(){
        return ResultVo.success("查询成功",articleService.getAll());
    }

    @RequestMapping("/add")
    private ResultVo add(Article article){
        articleService.add(article);
        return ResultVo.success("插入成功");
    }

    @RequestMapping("/delete")
    public ResultVo delete(Integer id){
        System.out.println(id);
        articleService.deleteById(id);
        return ResultVo.success("删除成功");
    }
}
