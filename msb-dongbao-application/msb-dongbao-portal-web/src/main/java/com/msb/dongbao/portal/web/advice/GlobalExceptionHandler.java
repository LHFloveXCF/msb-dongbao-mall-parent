package com.msb.dongbao.portal.web.advice;

import com.msb.dongbao.common.base.result.ResultWrapper;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * msb-dongbao-mall-parent
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResultWrapper customException() {
        return ResultWrapper.builder().code(301).msg("统一异常").build();
    }
}
