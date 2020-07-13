package com.yjh.service;

import com.yjh.dao.MemberMapper;
import com.yjh.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> getAll() {
        return memberMapper.selectAll();
    }

    @Override
    public void add(Member member) {
        memberMapper.insert(member);
    }

    @Override
    public void update(Member member)
    {
        memberMapper.updateByPrimaryKey(member);
    }

    @Override
    public void delete(Integer id) {
        memberMapper.deleteByPrimaryKey(id);
    }
}
