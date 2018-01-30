package com.ntqsolution.SiteProject.bussiness;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ntqsolution.SiteProject.bussiness.vo.PageVO;
import com.ntqsolution.SiteProject.bussiness.vo.UserVO;
import com.ntqsolution.SiteProject.common.exception.BusinessException;
import com.ntqsolution.SiteProject.repository.UserRepo;
import com.ntqsolution.SiteProject.repository.entites.User;

@Service
public class UserBusImpl extends BaseBus<User, UserVO> implements UserBus{
	private UserRepo userRepo;
	
	public UserBusImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public void addUser(UserVO userVO) {
		User user = mapper.voToEntity(userVO);
		if(userRepo.exists(userVO.getId())) {
			throw new BusinessException("User already existed");
		}
		userRepo.save(user);
	}
	
	@Override
	public UserVO getUser(int userId){
		if(!userRepo.exists(userId)) {
			throw new BusinessException("User name with userId: " + userId + "Not existed!");
		}
		User user = userRepo.findOne(userId);
		return mapper.entityToVO(user);
	}

	@Override
	public void removeUser(int userId) {
//		User user = mapper.voToEntity(userVO);
		userRepo.delete(userId);
	}

	@Override
	public void updateUser(UserVO userVO) {
		User user = mapper.voToEntity(userVO);
		if(!userRepo.exists(userVO.getId())) {
			throw new BusinessException("not found user" + userVO.getId());
		}
		userRepo.save(user);
	}
	
	@Override
	public PageVO<UserVO> getPage(Pageable pageable){
		Page<User> pageUser = userRepo.findAll(pageable);
		return mapper.buildPageVO(pageUser.getContent(), pageUser.getSize(), pageUser.getTotalPages());
	}
}
