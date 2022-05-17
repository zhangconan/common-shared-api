package com.conan.shared.api.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author conanzhang@木森
 * @description
 * @date 2018/10/16 下午2:41
 * @classname ListDataResult
 */
@Getter
@Setter
@ToString
public class ListDataResult<T> extends BaseResult {

    private static final long serialVersionUID = -5538804292408313119L;

    private List<T> data;
}
