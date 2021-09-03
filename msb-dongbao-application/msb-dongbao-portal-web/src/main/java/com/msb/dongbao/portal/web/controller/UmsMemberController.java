package com.msb.dongbao.portal.web.controller;


import com.msb.dongbao.ums.api.entity.UmsMember;
import com.msb.dongbao.ums.api.entity.dto.UmsMemberLoginDTO;
import com.msb.dongbao.ums.api.entity.dto.UmsMemberRegisterDTO;
import com.msb.dongbao.ums.api.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author xu
 * @since 2021-09-02
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController {

    @Autowired
    UmsMemberService service;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/register2")
    public String register() {
        UmsMember member = new UmsMember();
        member.setNickName("cff");
        service.insert(member);
        return "success";
    }

    @PostMapping("/register")
    public String register2(@RequestBody UmsMemberRegisterDTO umsMemberRegisterDTO) {
        service.insert(umsMemberRegisterDTO);
        return "success";
    }

    @RequestMapping("/login")
    public String login(@RequestBody UmsMemberLoginDTO umsMemberLoginDTO) {
        return service.login(umsMemberLoginDTO);
    }
}

