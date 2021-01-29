package xyz.marioding.edu.core.query;

import java.io.Serializable;

/**
 * 数据查询对象，各层接收上层的查询请求。注意超过 2 个参数的查询封装，禁止使用 Map 类 来传输。
 */
public interface Query extends Serializable {
}
