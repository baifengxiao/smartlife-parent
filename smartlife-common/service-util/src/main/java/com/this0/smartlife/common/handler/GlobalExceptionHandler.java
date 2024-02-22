package com.this0.smartlife.common.handler;


import com.this0.smartlife.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理运行时异常
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public Result exceptionError(RuntimeException e) {
        log.error("全局异常RuntimeException处理:{}", e);
        return Result.fail().message(e.getMessage());
    }

    /**
     * 处理各种类型异常
     */
    @ExceptionHandler(Exception.class)
    public Result exceptionError(Exception e) {
        log.error("全局异常Exception处理:{}", e);
        return Result.fail().message(e.getMessage());
    }
}