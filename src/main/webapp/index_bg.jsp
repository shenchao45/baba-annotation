<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="oscache" uri="http://www.opensymphony.com/oscache" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
现在时间：<%=new Date()%><br>
<oscache:cache>
缓存时间：<%=new Date()%>
</oscache:cache>
</body>
</html>
