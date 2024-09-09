package services;

import model.User;
import dao.UserDao;
import dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();
//viết các hàm đã định nghĩa bên interface service tại đây

	@Override
	public User login(String username, String password) {
		User user = this.findByUserName(username);
		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}
		return null;
	}

	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public User get(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean register(String username, String password, String email, String fullname, String phone) {
		if (userDao.checkExistUsername(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDao.insert(new User(0,email, username, fullname, password, null, 5, phone, date));
		return true;
	}

	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}
}
