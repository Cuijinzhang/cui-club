package com.cui.subject.common.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 枚举类 ResultCodeEnum 用于定义系统中的各种结果状态码及其描述信息。
 */
@Getter
public enum ResultCodeEnum {

    // 定义常用的状态码及其描述
    SUCCESS(200, "成功"),           // 200: 请求成功
    FAIL(500, "失败"),              // 500: 服务器内部错误
    UNAUTHORIZED(401, "未授权"),    // 401: 用户未授权
    NOT_FOUND(404, "未找到"),        // 404: 请求的资源未找到
    BAD_REQUEST(400, "错误请求");    // 400: 请求参数错误

    // 状态码
    public final int code;
    // 状态描述
    public final String desc;

    /**
     * 构造函数，初始化状态码和描述。
     *
     * @param code 状态码
     * @param desc 状态描述
     */
    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据状态码获取对应的枚举值。
     *
     * @param codeVal 状态码
     * @return 对应的 ResultCodeEnum 枚举值
     * @throws IllegalArgumentException 如果状态码无效，则抛出异常
     */
    public static ResultCodeEnum getByCode(int codeVal) {
        return Arrays.stream(ResultCodeEnum.values())
                .filter(resultCodeEnum -> resultCodeEnum.code == codeVal)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("无效的状态码: " + codeVal));
    }

    /**
     * 获取所有定义的状态码列表。
     *
     * @return 包含所有状态码的列表
     */
    public static List<Integer> getAllCodes() {
        return Arrays.stream(ResultCodeEnum.values())
                .map(ResultCodeEnum::getCode)
                .collect(Collectors.toList());
    }

    /**
     * 重写 toString 方法，以便于打印枚举时提供更友好的输出。
     *
     * @return 包含状态码和描述的字符串
     */
    @Override
    public String toString() {
        return "ResultCodeEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
