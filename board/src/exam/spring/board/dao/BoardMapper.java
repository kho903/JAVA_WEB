package exam.spring.board.dao;

import org.apache.ibatis.annotations.Mapper;

import exam.spring.board.dto.Board;
@Mapper
public interface BoardMapper {
	public Board getBoard(int id);
	public void deleteBoard();
	public void updateBoard();
	public int addBoard(Board board);
}