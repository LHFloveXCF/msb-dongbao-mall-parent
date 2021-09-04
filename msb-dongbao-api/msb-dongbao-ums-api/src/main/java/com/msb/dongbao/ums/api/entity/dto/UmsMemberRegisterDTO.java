package com.msb.dongbao.ums.api.entity.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * msb-dongbao-mall-parent
 */
@Data
@ToString
public class UmsMemberRegisterDTO {
    @NotNull(message = "用户名不能为空")
    @Size(min = 1, max = 8, message = "用户名保持1-8位")
    private String username;
    private String password;
    private String icon;
    private String email;
    private String nickName;
    private String note;
    private Integer status;
}
