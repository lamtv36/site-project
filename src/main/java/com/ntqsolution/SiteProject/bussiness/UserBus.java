package com.ntqsolution.SiteProject.bussiness;

import org.springframework.data.domain.Pageable;

import com.ntqsolution.SiteProject.bussiness.vo.PageVO;
import com.ntqsolution.SiteProject.bussiness.vo.UserVO;

public interface UserBus {
	
	public void addUser(UserVO userVO);

	public void removeUser(int userId);

	public UserVO getUser(int userId);

	public void updateUser(UserVO userVO);

	public PageVO<UserVO> getPage(Pageable pageable);
}
