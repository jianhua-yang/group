package com.yjh.controller;

import com.yjh.pojo.Member;
import com.yjh.service.MemberService;
import com.yjh.util.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @RequestMapping("/getAll")
    public ResultVo getAll(){
        return ResultVo.success("查询成功",memberService.getAll());
    }

    @RequestMapping("/add")
    public ResultVo add(Member member){
        memberService.add(member);
        return ResultVo.success("插入成功");
    }
    @RequestMapping("/update")
    public  ResultVo update(Member member)
    {
        System.out.println(member.toString());
        memberService.update(member);
        return ResultVo.success("更新成功");
    }
    @RequestMapping("/delete")
    public ResultVo delete(Integer id){
        System.out.println(id);
        memberService.delete(id);
        return ResultVo.success("删除成功");
    }


}
