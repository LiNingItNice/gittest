package com.xunnan.springboot.config.security.support;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回类 工具 （可返回任意类型的结果）
 * @author lining
 * @date 2020/12/17 - 16:35
 */
@Data
@NoArgsConstructor
@Builder
public class SimpleResponse {
    /**
     * 返回 内容 （json格式）
     */
    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }
}
