package com.msb.dongbao.ums.api.entity.dto;

import lombok.Data;
import lombok.ToString;

/**
 * msb-dongbao-mall-parent
 */
@Data
@ToString
public class UmsMemberRegisterDTO {
    private String username;
    private String password;
    private String icon;
    private String email;
    private String nickName;
    private String note;
    private Integer status;
}
