<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quên mật khẩu</title>
</head>
<body>
	<form action = "changePassword" method="POST">
	<section>
		<label class="input login-input">
			<div class="input-group">
				<span class="input-group-addon"><i class="fa fa-user"></i></span> 
				Nhập mail của tài khoản cần khôi phục: <input
					type="text" placeholder="Nhập mail" name="mail"
					class="form-control">
			</div>
		</label>
	</section>
	<section>
		<label class="input login-input">
			<div class="input-group">
				<span class="input-group-addon"><i class="fa fa-user"></i></span> 
				Nhập mật khẩu mới:  <input
					type="text" placeholder="Nhập mật khẩu mới" name="newPassword"
					class="form-control">
			</div>
		</label>
	</section>
	<section>
			<label class="input login-input"> 
			<div class="input-group">
				<span class="input-group-addon"><i class="fa fa-user"></i></span>
				<input type="submit" value="Gửi yêu cầu"
					class="form-control">
				</div>
			</label>
		</section>
		</form>
</body>
</html>