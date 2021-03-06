package com.tedu.provider.mapper;

import com.tedu.provider.entity.User;

/**
 * 处理用户数据的持久层接口
 */
public interface UserMapper {

    /**
     * 插入用户数据
     * @param user 用户数据
     * @return 受影响的行数，当插入成功时，可以从参数对象中获取自动递增的uid值
     */
    Integer insert(User user);


    /**
     * 根据用户名查询用户数据详情
     * @param username 用户名
     * @return 匹配的用户数据，如果没有匹配的数据，则返回null
     */
    User findByUsername(String username);


}