package com.ctyl.blog.spring_boot_jpa.repository;

import com.ctyl.blog.spring_boot_jpa.domain.User;

import java.util.List;

/**
 * User Repository 接口.
 * 
 * @since 1.0.0 2017年7月16日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserRepository {
	/**
	 * 新增或者修改用户
	 * @param user
	 * @return
	 */
	User saveOrUpateUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	void deleteUser(Long id);
	
	/**
	 * 根据用户id获取用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	
	/**
	 * 获取所有用户的列表
	 * @return
	 */
	List<User> listUser();
}
