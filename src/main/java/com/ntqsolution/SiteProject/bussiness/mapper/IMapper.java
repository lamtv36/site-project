package com.ntqsolution.SiteProject.bussiness.mapper;

import java.util.List;

import com.ntqsolution.SiteProject.bussiness.vo.PageVO;

public interface IMapper<Entity, VO> {
	
	public VO entityToVO(Entity entity);
	
	public List<VO> entityToVOs(List<Entity> entities);
	
	public Entity voToEntity(VO vo);
	
	public List<Entity> voToEntitys(List<VO> vos);
	
	public PageVO<VO> buildPageVO(List<Entity> vos, int page, int total);
	
}
