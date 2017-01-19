<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>There was a problem</title>
<style type="text/css">
body {
	background-repeat: no-repeat;
	background-size: 100%
}

h1 {
	margin-top: 30px;
	font-family: verdana;
	font-weight: bold;
	color : #ffffff;
	text-align: center;
	font-size: 50px;
}

p {
	margin-top: 10px;
	font-family: verdana;
	color: #ffffff;
	text-align: center;
	font-size: 50px;
}
</style>
</head>
<body
	background="http://vps355278.ovh.net/images/dance.gif">
	<h1>There was an error</h1><%--s:property value="errorCode" /--%>
	<p>You better go back and run!</p>
<%-- 	<p><s:property value="errorMessage" /></p> --%>
</body>
</html>
