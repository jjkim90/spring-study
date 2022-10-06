package springbook.user.dao;

public class DaoFactory {
	public UserDao userDao() {
		return new UserDao(connectionMaker());
	}
	
	public AccountDao accountDao() {
		return new AccountDao(connectionMaker());
	}
	
	public MessageDao messageDao() {
		return new MessageDao(connectionMaker());
	}
	
	// 메서드 추출로 분리하여 다양항 Dao에 대응 가능해짐.
	// 전략 패턴의 클라이언트 담당. 어떤 전략 콘크리트를 사용할 지 결정함.
	public ConnectionMaker connectionMaker() {
		return new NConnectionMaker();
	}
}
