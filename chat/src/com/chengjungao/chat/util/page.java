package com.chengjungao.chat.util;




import java.util.List;

public class page <T>{
	  private String crruntpage; //当前页
	  private String totalpage;//总页数
	  private String num;//总数
	  private String jumppage;//将访问的页数
	  private String condition;//查询条件
	  private List<T> pagelist;//记录list
	public String getCrruntpage() {
		return crruntpage;
	}
	public void setCrruntpage(String crruntpage) {
		this.crruntpage = crruntpage;
	}
	public String getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(String totalpage) {
		this.totalpage = totalpage;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getJumppage() {
		return jumppage;
	}
	public void setJumppage(String jumppage) {
		this.jumppage = jumppage;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public List<T> getPagelist() {
		return pagelist;
	}
	public void setPagelist(List<T> pagelist) {
		this.pagelist = pagelist;
	}
}
