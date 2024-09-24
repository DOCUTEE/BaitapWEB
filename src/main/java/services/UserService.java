package services;

import model.User;

public interface UserService {
	User login(String username, String password);
	User get(String username);
	User getFromMail(String mail);
	void insert(User user);
	void changePass(String mail, String newPassword);
	boolean register(String email, String password, String username, String fullname,int roleID ,String phone);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
}
