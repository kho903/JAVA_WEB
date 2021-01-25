package exam.spring.todo.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoList {
	private int num;
	private String todo;
	private Date updateDate;
	private int status;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TodoList [num=" + num + ", todo=" + todo + ", updateDate=" + updateDate + ", status=" + status + "]";
	}

}
