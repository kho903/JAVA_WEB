package kr.co.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.co.java.DTO.EmpDTO;
import kr.co.java.common.DBUtil;

public class EmpDAO {
	public boolean addEmp(EmpDTO emp) {
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "insert into employees values()";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps);
		}

		return resultFlag;
	}
}
