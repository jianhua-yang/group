package com.yjh.service;

import com.yjh.pojo.Article;

import java.util.List;

public interface ArticleService {

    public List<Article> getAll();

    void add(Article article);

    void deleteById(Integer id);
}
