package com.ntqsolution.SiteProject.controller.restapi;

import javax.validation.Valid;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ntqsolution.SiteProject.bussiness.UserBus;
import com.ntqsolution.SiteProject.bussiness.vo.PageVO;
import com.ntqsolution.SiteProject.bussiness.vo.UserVO;
import com.ntqsolution.SiteProject.constant.APIManager;
import com.ntqsolution.SiteProject.controller.GenericResponse;

@RestController
@RequestMapping(APIManager.USERS)
public class UserAPI extends BaseAPI{
	private UserBus userBus;
	
	public UserAPI(UserBus userBus) {
		this.userBus = userBus;
	}
	
	@GetMapping("/")
	public ResponseEntity<UserVO> getUser(@RequestParam(name="id") int userId){
		UserVO userVO = userBus.getUser(userId);
		return new ResponseEntity<UserVO>(userVO, HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<PageVO<UserVO>> getAll(Pageable pageable){
		PageVO<UserVO> pageVo = userBus.getPage(pageable);
		
		return new ResponseEntity<PageVO<UserVO>>(pageVo, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<GenericResponse> add(@RequestBody @Validated UserVO userVO){
		userBus.addUser(userVO);
		GenericResponse response = new GenericResponse("");
		return new ResponseEntity<GenericResponse>(response, HttpStatus.CREATED);
	}
	
	@DeleteMapping
	public ResponseEntity<GenericResponse> delete(@RequestBody UserVO userVO){
		userBus.removeUser(userVO.getId());
		GenericResponse response = new GenericResponse("");
		return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);
	}
	
	@PatchMapping
	public ResponseEntity<GenericResponse> update(@RequestBody UserVO userVO){
		userBus.updateUser(userVO);
		GenericResponse response = new GenericResponse("");
		return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);
	}
}
