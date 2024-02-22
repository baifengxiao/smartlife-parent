package com.this0.smartlife.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
public enum ResultCodeEnum {

    SUCCESS(200, "成功"),

    FAIL(201, "失败");

    private Integer code;

    private String message;

}
