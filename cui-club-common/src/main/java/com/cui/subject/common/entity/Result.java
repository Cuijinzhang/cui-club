package com.cui.subject.common.entity;

import com.cui.subject.common.enums.ResultCodeEnum;
import lombok.Data;

/**
 * 通用响应结果类
 *
 * @param <T> 响应数据的类型
 */
@Data
public class Result<T> {

    /**
     * 响应是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 返回成功的响应结果（无数据）
     *
     * @return 成功的 Result 对象
     */
    public static Result ok(){
        Result result = new Result();
        result.setSuccess(true); // 设置成功标志
        result.setCode(ResultCodeEnum.SUCCESS.getCode()); // 设置状态码为成功
        result.setMessage(ResultCodeEnum.SUCCESS.getDesc()); // 设置成功消息
        return result; // 返回成功的 Result 对象
    }

    /**
     * 返回成功的响应结果（包含数据）
     *
     * @param data 响应数据
     * @return 成功的 Result 对象
     */
    public static <T> Result ok(T data){
        Result result = new Result();
        result.setSuccess(true); // 设置成功标志
        result.setCode(ResultCodeEnum.SUCCESS.getCode()); // 设置状态码为成功
        result.setMessage(ResultCodeEnum.SUCCESS.getDesc()); // 设置成功消息
        result.setData(data); // 设置响应数据
        return result; // 返回成功的 Result 对象
    }

    /**
     * 返回失败的响应结果（无数据）
     *
     * @return 失败的 Result 对象
     */
    public static Result fail(){
        Result result = new Result();
        result.setSuccess(false); // 设置成功标志为 false
        result.setCode(ResultCodeEnum.FAIL.getCode()); // 设置状态码为失败
        result.setMessage(ResultCodeEnum.FAIL.getDesc()); // 设置失败消息
        return result; // 返回失败的 Result 对象
    }

    /**
     * 返回失败的响应结果（包含数据）
     *
     * @param data 响应数据
     * @return 失败的 Result 对象
     */
    public static <T> Result fail(T data){
        Result result = new Result();
        result.setSuccess(false); // 设置成功标志为 false
        result.setCode(ResultCodeEnum.FAIL.getCode()); // 设置状态码为失败
        result.setMessage(ResultCodeEnum.FAIL.getDesc()); // 设置失败消息
        result.setData(data); // 设置响应数据
        return result; // 返回失败的 Result 对象
    }
}
