<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Java Spring Boot Security Starter Project</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
	<body>
		<header>
			<h1>Java Spring Boot Security Starter Project</h1>
			<security:authorize access="!isAuthenticated()">
				Welcome Guest, <a href="/login">Login</a>
			</security:authorize>
			<security:authorize access="isAuthenticated()">
				Welcome <security:authentication property="Principal.username"/>, <a href="/logout">Logout</a>
			</security:authorize>
		</header>
		<nav>
			<ul>
				<li><a href="/">Index</a></li>
				<li><a href="/login">Login</a></li>
				<li><a href="/logout">Logout</a></li>
				<li><a href="/test">Test</a></li>
				<li><a href="/super-admin">Test super admin</a></li>
				<li><a href="/admin">Test admin</a></li>
			</ul>
		</nav>
	</body>
</html>
