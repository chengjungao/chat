package com.chengjungao.chat.base;






public interface baseDao<T> {

	
	public void add(T t);
	
	
	public void update(T t);
	
	
	public void updateBySelective(T t); 	
	
	public void delete(Object id);
	

	//public int queryByCount(T  t);
	
	//public List<T> queryByList(page<T> page);
	
	
	public T queryById(Object id);
}