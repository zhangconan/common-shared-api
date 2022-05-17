package com.conan.shared.api.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author conanzhang@木森
 * @description
 * @date 2018/10/16 下午2:37
 * @classname BaseResult
 */
@Getter
@Setter
@ToString
public class BaseResult implements Serializable {

    private static final long serialVersionUID = -3708641954763311681L;

    /**
     * 请求成功标示
     */
    private boolean success;
    /**
     * 请求错误码
     */
    private String code;
    /**
     * 请求提升信息
     */
    private String message;

    public static BaseResult error(String message) {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(false);
        baseResult.setMessage(message);
        return baseResult;
    }
}
