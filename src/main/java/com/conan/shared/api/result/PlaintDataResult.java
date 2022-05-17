package com.conan.shared.api.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author conanzhang@木森
 * @description
 * @date 2018/10/16 下午2:37
 * @classname PlaintDataResult
 */
@Setter
@Getter
@ToString
public class PlaintDataResult<T> extends BaseResult implements Serializable {

    private static final long serialVersionUID = -4905795433769790667L;
    /**
     * 数据
     */
    private T data;
}
