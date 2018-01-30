package com.ntqsolution.SiteProject.bussiness.mapper;

import org.springframework.stereotype.Component;

import com.ntqsolution.SiteProject.bussiness.vo.UserVO;
import com.ntqsolution.SiteProject.repository.entites.User;

@Component
public class UserMapper extends AbstractMapper<User, UserVO>{

	@Override
	public UserVO entityToVO(User user) {
		UserVO userVO = new UserVO();
		userVO.setId(user.getId());
		userVO.setEmail(user.getEmail());
		userVO.setName(user.getName());
		userVO.setPassword(user.getPassword());
		return userVO;
	}

	@Override
	public User voToEntity(UserVO userVO) {
		User user = new User();
		user.setEmail(userVO.getEmail());
		user.setName(userVO.getName());
		user.setPassword(userVO.getPassword());
		return user;
	}
}
