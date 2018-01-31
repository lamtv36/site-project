package com.ntqsolution.SiteProject.bussiness.vo;

import java.util.List;

public class PageVO<VO> {
	private int total;
	private int records;
	private int page;
	private List<VO> rows;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public List<VO> getRows() {
		return rows;
	}
	public void setRows(List<VO> rows) {
		this.rows = rows;
	}
}
