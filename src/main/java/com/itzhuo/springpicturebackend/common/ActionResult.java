package com.itzhuo.springpicturebackend.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.itzhuo.springpicturebackend.exception.ErrorCode;
import lombok.Data;

import java.util.List;

/**
 * 全局封装类
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionResult<T> {

    private int code;

    private T data;

    private String msg;

    /* ============== success ============ */

    public static <T> ActionResult<T> success() {
        ActionResult<T> jsonData = new ActionResult<>();
        jsonData.setCode(ErrorCode.SUCCESS.getCode());// 0
        jsonData.setMsg(ErrorCode.SUCCESS.getMessage()); // ok
        return jsonData;
    }

    public static <T> ActionResult<T> success(String msg) {
        ActionResult<T> jsonData = new ActionResult<>();
        jsonData.setCode(ErrorCode.SUCCESS.getCode());// 0
        jsonData.setMsg(msg);
        return jsonData;
    }

    public static <T> ActionResult<T> success(T object) {
        ActionResult<T> jsonData = new ActionResult<>();
        jsonData.setData(object);
        jsonData.setCode(ErrorCode.SUCCESS.getCode());// 0
        jsonData.setMsg(ErrorCode.SUCCESS.getMessage()); // ok
        return jsonData;
    }

    public static <T> ActionResult<T> success(String msg, T object) {
        ActionResult<T> jsonData = new ActionResult<>();
        jsonData.setData(object);
        jsonData.setCode(ErrorCode.SUCCESS.getCode()); // 0
        jsonData.setMsg(msg); // ok
        return jsonData;
    }

    /* ============== fail ============ */

    public static <T> ActionResult<T> fail(int code, String message) {
        ActionResult<T> jsonData = new ActionResult<>();
        jsonData.setCode(code);
        jsonData.setMsg(message);
        return jsonData;
    }

    public static ActionResult<String> fail(String msg, String data) {
        ActionResult<String> jsonData = new ActionResult<>();
        jsonData.setMsg(msg);
        jsonData.setData(data);
        return jsonData;
    }

    public static <T> ActionResult<T> fail(String msg) {
        ActionResult<T> jsonData = new ActionResult<>();
        jsonData.setMsg(msg);
        jsonData.setCode(40000);
        return jsonData;
    }

}
