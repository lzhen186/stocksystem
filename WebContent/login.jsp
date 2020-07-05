<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="bootstrap/js/jquery-3.5.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
   	<link type="text/css"  rel="styleSheet" href="bootstrap/css/css.css">
</head>
<body>
	<%=request.getAttribute("message")%>
	 <div class="row">
	 <form action="LoginServlet" method="post">
            <div class="col-md-5 center-block"  id="content" style="margin: 50px 320px;">
                <div class="page-header">
                    <h1>大花菜 <small>采购系统(内部)</small></h1>
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1">账户</span>
                    <input type="text" class="form-control" placeholder="请输入账户" aria-describedby="sizing-addon1" name="name">
                </div>
                <br> <br>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1">密码</span>
                    <input type=password class="form-control" placeholder="请输入密码" aria-describedby="sizing-addon1" name="pwd">
                </div>
                <br> <br>
                <a href="index.html"><button type="submit" class="btn btn-primary btn-lg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;登录&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button></a>
            </div>
        </form>
        </div>
</body>
</html>