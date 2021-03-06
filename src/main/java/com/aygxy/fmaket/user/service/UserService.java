package com.aygxy.fmaket.user.service;

import com.aygxy.fmaket.user.entity.UserInfo;

public interface UserService {
	
	/**
	 * 根据用户id获取用户信息
	 * @param userId
	 * @return
	 */
	public UserInfo getUserInfo(String userId);
	
	public boolean saveUserInfo(UserInfo userInfo);
	
	public boolean updateUserInfo(UserInfo userInfo);
	
	public boolean deleteUserInfo(String userId);
	
}
