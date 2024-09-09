<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/loginWeb/register" method="post">
		<h2>Tạo tài khoản mới</h2>
		<c:if test="${alert !=null}">
			<h3 class="alert alertdanger">${alert}</h3>
		</c:if>
		<section>
			<label class="input login-input">
				<div class="input-group">
					<span class="input-group-addon"><i class="fa fa-user"></i></span> <input
						type="text" placeholder="email" name="email"
						class="form-control">
						<input
						type="text" placeholder="username" name="username"
						class="form-control">
						<input type="text" placeholder="fullname" name="fullname"
						class="form-control">
						<input type="text" placeholder="password" name="password"
						class="form-control">
						<input type="text" placeholder="phone" name="phone"
						class="form-control">
						<input type="Submit" value="Submit">
				</div>
			</label>
		</section>
</body>
</html>