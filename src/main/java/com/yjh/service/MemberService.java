package com.yjh.service;

import com.yjh.pojo.Member;

import java.util.List;

public interface MemberService {
    public List<Member> getAll();

    void add(Member member);

    void update(Member member);

    void delete(Integer id);
}
