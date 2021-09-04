package com.msb.dongbao.portal.web.advice;

import com.msb.dongbao.common.base.result.ResultWrapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * msb-dongbao-mall-parent
 */
@RestControllerAdvice
public class ValidateHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        StringBuilder stringBuilder = new StringBuilder();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            String message = error.getDefaultMessage();
            stringBuilder.append(message);
            break;
        }
        return new ResponseEntity<>(ResultWrapper.builder().code(102).msg(stringBuilder.toString()).build(), HttpStatus.OK);
    }
}
