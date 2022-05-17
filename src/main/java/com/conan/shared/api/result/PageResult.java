package com.conan.shared.api.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author conanzhang@木森
 * @description 分页result
 * @date 2020-05-09 00:04
 * @classname PageResult
 */
@Getter
@Setter
@ToString
public class PageResult<T> extends BaseResult {
    /**
     * 特殊标记
     */
    private String specialFlag;
    /**
     * 返回数据
     */
    private List<T> data;
}
