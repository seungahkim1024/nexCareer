package com.ch.rm.service;

import java.util.Collection;


import com.ch.rm.model.Board;

public interface BoardService {

	//Collection<Board> list(int startRow, int endRow);
	Collection<Board> list(Board board);
	int getTotal(Board board);
	
	Board select(int num);
	void updateReadcount(int num);
	int maxNum();
	int insert(Board board);
	int update(Board board);
	int delete(Board board);
	void updateStep(Board board);
	

}