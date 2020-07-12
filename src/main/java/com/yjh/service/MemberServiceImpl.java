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
}
