package com.ntqsolution.SiteProject.bussiness;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ntqsolution.SiteProject.bussiness.vo.PageVO;
import com.ntqsolution.SiteProject.bussiness.vo.UserVO;
import com.ntqsolution.SiteProject.common.exception.BusinessException;
import com.ntqsolution.SiteProject.repository.DivisionRepo;
import com.ntqsolution.SiteProject.repository.TeamRepo;
import com.ntqsolution.SiteProject.repository.UserRepo;
import com.ntqsolution.SiteProject.repository.entites.Division;
import com.ntqsolution.SiteProject.repository.entites.User;

@Service
public class UserBusImpl extends BaseBus<User, UserVO> implements UserBus{
	private UserRepo userRepo;
	private DivisionRepo divisionRepo;
	private TeamRepo teamRepo;
	
	public UserBusImpl(UserRepo userRepo, DivisionRepo divisionRepo, TeamRepo teamRepo) {
		this.userRepo = userRepo;
		this.divisionRepo = divisionRepo;
		this.teamRepo = teamRepo;
	}
	
	@Override
	public void addUser(UserVO userVO) {
		if(userRepo.existsByEmail(userVO.getEmail())) {
			throw new BusinessException("User already existed");
		}
		
		if(!validateDivision(userVO.getDivision())) {
			
		}
		User user = mapper.voToEntity(userVO);
		userRepo.save(user);
	}
	
	private boolean validateDivision(Division division) {
		return divisionRepo.exists(division.getId()) || divisionRepo.existsByName(division.getName());
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
	public UserVO getUserByEmail(String email) {
		User user = userRepo.findByEmail(email);
		return mapper.entityToVO(user);
	}

	@Override
	public void removeUser(int userId) {
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
