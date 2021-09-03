package com.msb.dongbao.ums.service.impl;

import com.msb.dongbao.ums.api.entity.UmsMember;
import com.msb.dongbao.ums.api.entity.dto.UmsMemberLoginDTO;
import com.msb.dongbao.ums.api.entity.dto.UmsMemberRegisterDTO;
import com.msb.dongbao.ums.api.service.UmsMemberService;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author xu
 * @since 2021-09-02
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper mapper;
    @Autowired
    PasswordEncoder encoder;

    @Override
    public void insert(UmsMember umsMember) {
        mapper.insert(umsMember);
    }

    @Override
    public void insert(UmsMemberRegisterDTO umsMemberRegisterDTO) {
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMemberRegisterDTO, umsMember);
        umsMember.setPassword(encoder.encode(umsMemberRegisterDTO.getPassword()));
        mapper.insert(umsMember);
        System.out.println("用户添加成功！");
    }

    @Override
    public String login(UmsMemberLoginDTO umsMemberLoginDTO) {
        UmsMember umsMember = mapper.selectByName(umsMemberLoginDTO.getUsername());
        if (null == umsMember) {
            return "用户不存在";
        } else {
            if (!encoder.matches(umsMemberLoginDTO.getPassword(), umsMember.getPassword())) {
                return "密码错误";
            }
        }
        System.out.println("登录成功");
        return "token";
    }
}
