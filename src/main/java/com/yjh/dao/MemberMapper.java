package com.yjh.dao;

import com.yjh.pojo.Member;
import java.util.List;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Member record);

    Member selectByPrimaryKey(Integer userid);

    List<Member> selectAll();

    int updateByPrimaryKey(Member record);
}