package com.ntqsolution.SiteProject.bussiness.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ntqsolution.SiteProject.bussiness.vo.UserVO;
import com.ntqsolution.SiteProject.repository.entites.User;

@Component
public class UserMapper extends AbstractMapper<User, UserVO>{
	private static ModelMapper modelMapper = new ModelMapper();
	
	
	@Override
	public UserVO entityToVO(User user) {
		return modelMapper.map(user, UserVO.class);
	}

	@Override
	public User voToEntity(UserVO userVO) {
		User user = modelMapper.map(userVO, User.class);
		return user;
	}
}
