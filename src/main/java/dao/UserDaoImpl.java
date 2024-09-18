package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import configs.DBConnection;
import model.User;

public class UserDaoImpl implements UserDao {
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	public User findByUserName(String username) {
		String sql = "SELECT * FROM [Users] WHERE username = ? ";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			System.out.print(username);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print("TAO VAO DUOC DAY ROI");
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setUserName(rs.getString("username"));
				user.setFullName(rs.getString("fullname"));
				user.setPassWord(rs.getString("password"));
				user.setAvatar(rs.getString("avatar"));
				user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setPhone(rs.getString("phone"));
				user.setCreatedDate(rs.getDate("createdDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("Deo co");
		return null;
	}

	@Override
	public User get(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User user) {
		String sql = "INSERT INTO [Users](id,email, username, fullname, password, avatar, roleid,phone, createddate) VALUES (0,?,?,?,?,?,?,?,?)";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFullName());
			ps.setString(4, user.getPassWord());
			ps.setString(5, user.getAvatar());
			ps.setInt(6, user.getRoleid());
			ps.setString(7, user.getPhone());
			ps.setDate(8, (Date) user.getCreatedDate());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkExistEmail(String email) {
		boolean duplicate = false;
		String query = "select * from [Users] where email = ?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception ex) {
		}
		return duplicate;
	}

	@Override
	public boolean checkExistUsername(String username) {
		boolean duplicate = false;
		String query = "select * from [Users] where username = ?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception ex) {
		}
		return duplicate;
	}

	@Override
	public boolean checkExistPhone(String phone) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
