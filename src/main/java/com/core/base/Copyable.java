package com.core.base;

import com.core.util.clone.CopyPros;

/**
 * 对象拷贝
 * @author daixu
 * @dete 2022-09-15 22:55
 */
public interface Copyable<T> {
    @SuppressWarnings("unchecked")
    default T copy(Object obj) {
        return (T)CopyPros.copyProperties(obj,this.getClass());
    }
}
