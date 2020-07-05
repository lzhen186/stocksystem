<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	 <link rel="stylesheet" href="bootstrap/css/css.css" rel="stylesheet">
    <script src="bootstrap/js/jquery-3.5.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
</head>
	<body>
    <div class="row">

        <div class="col-md-1">
            
            <nav class="navbar navbar-inverse" id="nav">
                <ul>
                    <a href="index.jsp"><li class="navitem1">欢迎</li></a>
                    <a href="GoodsServlet?current=1"><li class="navitem1">采购</li></a>
                     <a href="ListerServlet"><li class="navitem1">订单</li></a>
                </ul>
              </nav>
              
        </div>

        <div class="col-md-10" id="content">
            <p style="font-size: 100px;" ><strong>WELCOME</strong></p>
        </div>
        
        
        
        </div>

      </div>
</body>
</html>