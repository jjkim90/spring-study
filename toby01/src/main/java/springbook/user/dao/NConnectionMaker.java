package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 전략 콘크리트(concrete strategy).
public class NConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/toby", "toby", "toby");
		return c;
	}
		// N사의 독자적인 방법으로 Connection을 생성하는 코드

}
