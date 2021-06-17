<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" >
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Log in</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
</head>
<body class="text-center">
<form class="form-signin" action="validate" method="post">
    <img class="mb-4" src="img/biao.jpg" alt="" width="80" height="80">
    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    <p style="color: red" >${sessionScope.msg}</p>
    <label for="inputEmail" class="sr-only">Username</label>
    <input type="text" id="inputEmail" name="Uname" class="form-control" placeholder="Username" style="margin-bottom: 8px" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" name="Password" class="form-control" placeholder="Password" required>
    <div class="mb-3" >
            <a  href="changepassword.jsp">Change your password</a>
    </div>
    <input class="btn btn-md btn-primary " type="submit" style="margin-right: 50px" value="Sign in"/>
    <a class="btn btn-md btn-primary" href="register.jsp">Register</a>
    <p class="mt-5 mb-3 text-muted">&copy; 2021-2023</p>
</form>
</body>
</html>
