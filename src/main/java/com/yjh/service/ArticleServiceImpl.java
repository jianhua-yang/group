package com.yjh.service;

import com.yjh.dao.ArticleMapper;
import com.yjh.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> getAll() {
        return articleMapper.selectAll();
    }
}
