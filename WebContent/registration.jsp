<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
!DocType html>
<html>
<head>
<title>Customer Register</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
input,textarea {
font-family: FontAwesome;
border-bottom: 1px solid #fd9267;
box-shadow: 0 1px 0 0 #fd9267;
}
body {
background-image: url("");
text-align:center;
background-color: rgb(15, 15, 15);
background-repeat: no-repeat;
}
}
</style>
</head>
<body>
<div class="container-fluid">
<div class="row">
<div class="col-sm-4 col-md-4 col-lg-4">
<form class="form-container" action="register.java" method="post">
<div class="form-group">
<h4 class="text-center font-weight-bold">Customer Registration </h4>
<span ><i class="fa fa-user"></i></span>
<label> User Name</label>
<input type="text" class="form-control" placeholder="Username" class="fa fa-user" name="user">
</div>
<div class="form-group">
<span ><i class="fa fa-lock"></i></span>
<label> Password</label>
<input type="password" class="form-control" placeholder="Password" name="pwd">
</div>
<div class="form-group">
<span ><i class="fa fa-user"></i></span>
<label> FullName</label>
<input type="text" class="form-control" placeholder="Fullname" name="fname">
</div>
<div class="form-group">
<span ><i class="fa fa-envelope"></i></span>
<label> Email</label>
<input type="text" class="form-control" placeholder="E-Mail" name="email">
</div>
<div class="form-group">
<span ><i class="fa fa-envelope"></i></span>
<label> Phone Number</label>
<input type="text" class="form-control" placeholder="Phone Number" name="phno">
</div>
<button type="submit" class="btn btn-primary btn-block">Submit</button>
</form>
</div>
</div>
</div>
</body>