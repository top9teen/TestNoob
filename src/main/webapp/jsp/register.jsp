<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>


<div class="container" >
		<form name="login" action="gotoregister" method="post">
			<div class="panel panel-primary" style="margin-top: 15%">
				<div class="panel-heading">สมัคร user</div>
				<div class="panel-body">
					<div class="form-group">
						<label for="exampleInputEmail1">username</label> <input type="text"
							class="form-control" placeholder="username" name="username">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" class="form-control" placeholder="Password"
							name="password">
					</div>
				<div class="form-group">
						<select name="roleId" class="form-control">
					<option value="1"> Admin </option>
					<option value="2"> User </option>
					</select>
					</div>
				</div>
				<div class="panel-footer">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>

		</form>
	</div>


</body>
</html>