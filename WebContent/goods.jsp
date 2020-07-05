<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
   	<script>
		function myFunction() {
		  	alert("成功添加到采购车！");
		}
		</script>
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
			
            <div class="search">
            	<form action="SearchServlet" method="post" >
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="关键字搜索" style="background-color:white;" name="content">
                    <span class="input-group-btn">
                      <input type="submit" class="btn btn-default btn-lsm" >
					     <span class="glyphicon glyphicon-star" aria-hidden="true"></span>
					  </input>
                    </span>
                </div> 
                </form>
            </div>
			
			
            <div class="goods" style="width: 100%; height: 80%; background-color:#009999;margin-top: 10px;padding:20px 20px;border-radius: 5px;">
               	<c:forEach items="${goods}" var="goods">
                <div class="col-sm-2 col-md-2" ">
                    <div class="thumbnail">
	                    <img src="image/picv.png" alt="图片">
	                    <div class="caption">
	                        <h3><c:out value="${goods.dishname}"/></h3>
	                        <p>￥<c:out value="${goods.dishprice}"/>(还有<c:out value="${goods.dishnum}"/>kg)</p>
	                        <p><a href="ListServlet?id=${goods.id}&name=${goods.dishname}&num=${goods.dishnum}&price=${goods.dishprice}&current=${requestScope.current}" class="btn btn-primary" role="button" onClick="myFunction()">订购</a> 
	                    </div>
                    </div>
                </div>
 				</c:forEach>
              
            </div>
            <div class="footer" style="width:250px;height: 50px;margin: 0 auto;">
               
                    <ul class="pagination">
                      <li>													
                        <a href="GoodsServlet?current=<%if(request.getAttribute("current") != request.getAttribute("frist")){%>${requestScope.current-1}<%}else{%>${requestScope.current}<%}%>" aria-label="Previous">
                          <span aria-hidden="true">上一页</span>
                        </a>
                      </li>
                      <li class="active" >
                     	<div class="btn-group dropup" style="display:inline;float:left;">
						<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" type="button">${requestScope.current}&nbsp;/&nbsp;${requestScope.pages}<span class="caret"></span></button>
						<ul class="dropdown-menu">
						<c:forEach var="s" begin="1" end="${pages}">
						<li><a href="GoodsServlet?current=${s}"><c:out value="${s}"/></a></li>
						</c:forEach>
						</ul>
						</div>
					 </li>
                      <li>
                        <a href="GoodsServlet?current=<%if(request.getAttribute("current") != request.getAttribute("pages")){%>${requestScope.current+1}<%}else{%>${requestScope.current}<%}%>" aria-label="Next">
                          <span aria-hidden="true">下一页</span>
                        </a>
                      </li>
                    </ul>	
            </div>

        </div>
        
        <div class="col-md-1" style="background-color: yellow;">
        
        </div>

      </div>
</body>
</html>