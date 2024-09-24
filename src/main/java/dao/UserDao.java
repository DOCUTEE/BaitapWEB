package dao;

import model.User;

public interface UserDao {
	User get(String username);

	User findByUserName(String username);
	User findByMail(String mail);
	void insert(User user);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	void changePass(String mail, String newPassword);
}
