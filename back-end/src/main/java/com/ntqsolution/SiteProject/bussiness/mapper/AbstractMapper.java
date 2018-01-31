package com.ntqsolution.SiteProject.bussiness.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.ntqsolution.SiteProject.bussiness.vo.PageVO;

public abstract class AbstractMapper<Entity, VO> implements IMapper<Entity, VO> {
	
	@Override
	public List<VO> entityToVOs(List<Entity> entities) {
		return entities.stream().map(this::entityToVO).collect(Collectors.toList());
	}
	
	@Override
	public List<Entity> voToEntitys(List<VO> entities) {
		return entities.stream().map(this::voToEntity).collect(Collectors.toList());
	}
	
	@Override
	public PageVO<VO> buildPageVO(List<Entity> entites, int page, int total) {
		if(null == entites) return null;
		PageVO<VO> result = new PageVO<>();
		result.setPage(page);
		result.setRecords(entites.size());
		result.setRows(entityToVOs(entites));
		result.setTotal(total);
		return result;
	}
}
