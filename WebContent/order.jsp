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
            <ul class="nav nav-tabs">
                <li role="presentation"><a href="ListerServlet">采购车</a></li>
                <li role="presentation"  class="active"><a href="order.jsp">订单</a></li>
            </ul>
            
            
                <div class="panel panel-default" id="lists">
                
                    <table class="table table-striped" >
                        <tr>
                            <td class="col-md-3"><h4>订单号</h4></td>
                            <td><h4>明细</h4></td>
                        </tr>
                        <tr>
                            <td>001</td>
                            <td>
                                <ul class="listss">
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                </ul>
                            </td>
                           
                           
                        </tr>
                        <tr class="info">
                            <td>001</td>
                            <td>
                                <ul class="listss">
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                    <li>黄瓜*100</li>
                                    <li>西瓜*300</li>
                                </ul>
                            </td>
                            
                        </tr>
                       
                    </table>
                    </div>
               
                
            
            
        </div>
        
        
        <div class="col-md-1" style="background-color: yellow;">
        
        </div>

      </div>
</body>
</html>