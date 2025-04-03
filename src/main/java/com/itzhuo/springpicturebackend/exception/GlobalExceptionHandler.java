package com.itzhuo.springpicturebackend.exception;

import com.itzhuo.springpicturebackend.common.ActionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ActionResult<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ActionResult.fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ActionResult<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ActionResult.fail(ErrorCode.SYSTEM_ERROR.getCode(), ErrorCode.SYSTEM_ERROR.getMessage());
    }
}


