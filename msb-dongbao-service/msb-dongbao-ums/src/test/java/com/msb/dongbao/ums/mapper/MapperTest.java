package com.msb.dongbao.ums.mapper;

import com.msb.dongbao.ums.MsbDongbaoUmsApplication;
import com.msb.dongbao.ums.api.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * msb-dongbao-mall-parent
 */
@SpringBootTest(classes = MsbDongbaoUmsApplication.class)
public class MapperTest {
    @Autowired
    UmsMemberMapper mapper;
    @Test
    void testInsert() {
        UmsMember t = new UmsMember();
        t.setNickName("hello");
        t.setPassword("123");
        t.setId(2L);
        t.setLoginTime(new Date());
        mapper.insert(t);
    }
}
