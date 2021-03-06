package com.yjh.pojo;
import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer id;

    private String title;

    private String data;

    private String category;

    private String sort;

    private String detail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDate() {
        return data;
    }

    public void setDate(String date) {
        this.data = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + data +
                ", category='" + category + '\'' +
                ", sort='" + sort + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}