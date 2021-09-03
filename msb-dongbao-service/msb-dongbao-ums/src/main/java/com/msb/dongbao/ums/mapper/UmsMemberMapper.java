package com.msb.dongbao.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.dongbao.ums.api.entity.UmsMember;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author xu
 * @since 2021-09-02
 */
@Repository
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    UmsMember selectByName(String name);
}
