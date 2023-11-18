<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Đăng Nhập</title>
  <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
          crossorigin="anonymous"></script>
  <link rel="stylesheet" href="login.css">

</head>
<body>
  <div id="wrapper">
    <form action="action" id="form-login" method="get">
      <input type="hidden" name="action" value="login">
      <h1 class="form-heading">Login</h1>

      <div class="form-group">
        <i class="far fa-user"></i>
        <input type="text" class="form-input" placeholder="Email" name="email">
      </div>

      <div class="form-group">
        <i class="fas fa-key"></i>
        <input type="password" class="form-input" placeholder="Password" name="psw">
        <div id="eye">
          <i class="far fa-eye"></i>
        </div>
      </div>
      <input type="submit" value="Login" class="form-submit" name="login">
      <input type="reset" value="Clear" class="form-submit" id="btn2">

    </form>
  </div>
</body>
</html>