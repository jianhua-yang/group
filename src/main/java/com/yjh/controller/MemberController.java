package com.yjh.controller;

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
}
