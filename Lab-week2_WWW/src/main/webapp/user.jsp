<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 18/11/2023
  Time: 8:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
    <title>Dashboard</title>
    <style>
        li{
            font-size: 20px;
        }

    </style>
</head>
<body>
<section class="container ">
    <%--menu--%>
    <div class="navbar bg-light navbar-expand-md">

        <ul class="nav navbar-nav col-md-7">
            <li class="nav-item"><a href="" class="nav-link"> Profile</a></li>


        </ul>

        <ul class="nav navbar-expand col-2">
            <%
                String roleID = request.getAttribute("roleID") + "";
            %>
            <H5 >Hello <%=roleID%></H5>
        </ul>
        <ul class="nav navbar-expand col-4">

            <li class="nav-item">
                <button onclick="logout()">Logout</button></li>

        </ul>
    </div>
    <%--Thông tin người dùng--%>
    <div class="row row-gap-3 align-items-center">

        <div class="col-4 fw-semibold">Account ID</div>
        <div class="col-8">

            <%
                String accountID = request.getAttribute("accountID") + "";
            %>
            <input value="<%=accountID%>" class="form-control" type="text" disabled readonly>
        </div>

        <div class="col-4 fw-semibold">Full name</div>
        <div class="col-8">
            <%
                String fullName = request.getAttribute("fullName") + "";
            %>
            <input value="<%=fullName%>" class="form-control" type="text" disabled readonly>
        </div>

        <div class="col-4 fw-semibold">Email</div>
        <div class="col-8">
            <%
                String email = request.getAttribute("email") + "";
            %>
            <input value="<%= email %>" class="form-control" type="text" disabled readonly >
        </div>

        <div class="col-4 fw-semibold">Phone</div>
        <div class="col-8">
            <%
                String phone = request.getAttribute("phone") + "";
            %>
            <input value="<%= phone %>" class="form-control" type="text" disabled readonly>
        </div>
    </div>
    <%--Role table--%>
    <div class="container mt-5 mx-auto">
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Role id</th>
                <th scope="col">Role Name</th>
                <th scope="col">Description</th>

            </tr>
            </thead>
            <tbody>
            <tr>

                <td><%=roleID%></td>
                <%
                    String roleName = request.getAttribute("roleName") + "";
                %>
                <td><%=roleName%></td>
                <%
                    String description = request.getAttribute("description") + "";
                %>
                <td><%=description%></td>
            </tr>

            </tbody>
        </table>
    </div>

</section>
<script>
    function logout() {
        window.location.href = "index.jsp";
    }
</script>

</body>
</html>
