package com.msb.dongbao.ums.api.service;

import com.msb.dongbao.ums.api.entity.UmsMember;
import com.msb.dongbao.ums.api.entity.dto.UmsMemberLoginDTO;
import com.msb.dongbao.ums.api.entity.dto.UmsMemberRegisterDTO;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author xu
 * @since 2021-09-02
 */
public interface UmsMemberService {
    void insert(UmsMember umsMember);

    void insert(UmsMemberRegisterDTO umsMemberRegisterDTO);

    String login(UmsMemberLoginDTO umsMemberLoginDTO);
}
