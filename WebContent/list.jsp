<%@page import="entity.Lister"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                <li role="presentation" class="active"><a href="ListerServlet">采购车</a></li>
                <li role="presentation"><a href="order.jsp">订单</a></li>
            </ul>
            
            <div class="panel panel-default" id="lists">
                <a href="UpOrderServlet"><button type="button" class="btn btn-success btn-lg btn-block">提交订单</button></a>
            	<a href="ClearListerServlet" class="col-md-1"><h4>清空</h4></a>
                <table class="table table-striped" >
                    <tr>
                        <td><h4>序号</h4></td>
                        <td><h4>名称</h4></td>
                        <td><h4>数量</h4></td>
                        <td><h4>操作</h4></td>
                    </tr>
                    <c:forEach items="${lister}" var="lists">
                    <tr>
                        <td>${lists.id}</td>
                        <td>${lists.dishname}</td>
                        <td><a href="UpListByIdServlet?id=${lists.id}&dishnum=${lists.dishnum-100}&dishname=${lists.dishname}">.-.</a>&nbsp;&nbsp;${lists.dishnum}斤 <a href="UpListByIdServlet?id=${lists.id}&dishnum=${lists.dishnum+100}&dishname=${lists.dishname}">.+.</a></td>
                        <td><a href="DelListByIdServlet?id=${lists.id}">删除</a></td>
                    </tr>
                    </c:forEach>
				</table>
            </div>
           
        </div>
        
        
        <div class="col-md-1" style="background-color: yellow;">
        
        </div>

      </div>
</body>
</html>