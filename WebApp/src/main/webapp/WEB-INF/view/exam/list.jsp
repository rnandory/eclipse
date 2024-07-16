<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>
	<section>
		<header>
			<div>1 page</div>
			<h1>성적목록 ${name}</h1>
		</header>
		<table>
			<caption>성적출력</caption>
			<thead>
				<tr>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
					<th>총점</th>
					<th>평균</th>
					<th>성적</th>
				</tr>
			</thead>
			<tbody>
			
			<c:forEach begin="0" end="5">
				<tr>
					<td><a href="/exam/detail">${list[1].name}</a></td>
					<td>0</td>
					<td>80</td>
					<td>30</td>
					<td>110</td>
					<td>36.67</td>
					<td>F</td>
				</tr>
				
				<tr>
					<td><a href="/exam/detail"><%-- <%= exams[i].getName() %> --%></a></td>
					<td></td> 
				</tr>
			</c:forEach>
								
			</tbody>
		</table>
	</section>
</body>
</html>