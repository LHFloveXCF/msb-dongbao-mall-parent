package com.msb.dongbao.common.base.result;

import com.msb.dongbao.common.base.enums.StateCodeEnum;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * msb-dongbao-mall-parent
 */
@Data
@Builder
public class ResultWrapper<T> implements Serializable {
    // 状态码
    private int code;

    // 提示信息
    private String msg;

    private T data;

    public static ResultWrapper.ResultWrapperBuilder suc() {
        return ResultWrapper.builder().code(StateCodeEnum.SUCCESS.getCode()).msg(StateCodeEnum.SUCCESS.getDesc());
    }

    public static ResultWrapper.ResultWrapperBuilder fail() {
        return ResultWrapper.builder().code(StateCodeEnum.FAIL.getCode()).msg(StateCodeEnum.FAIL.getDesc());
    }
}
