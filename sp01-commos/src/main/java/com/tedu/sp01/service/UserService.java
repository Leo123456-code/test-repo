package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);//获取用户
	void addScore(Integer id, Integer score);//增加积分

}
