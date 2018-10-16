package com.ctyl.blog.repository;


import com.ctyl.blog.domain.User;

import java.util.List;

/**
 * UserRepository接口
 */
public interface UserRepository {
    /**
     * 创建或修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUSer(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUsers();
}
