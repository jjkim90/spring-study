package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

// 전략 패턴의 전략(strategy) 역할. 캡슐화 담당 인터페이스.
public interface ConnectionMaker {
	public Connection makeConnection() throws ClassNotFoundException, SQLException;

}
