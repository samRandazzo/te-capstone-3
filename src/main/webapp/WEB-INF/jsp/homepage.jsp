<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@include file="common/header.jsp"%>



<!DOCTYPE html>
<html>
<head>
<title>National Parks Homepage</title>
<%-- <link rel="stylesheet" href="css/site.css"></link> --%>
</head>
<body>
	<div id="main_content">
		<h1>National Parks Homepage</h1>

		<table border="1">
			<c:forEach var="park" items="${parks}">
				<c:url value="/parkdetail" var="parkHref">
				<c:param name="parkcode" value="${park.parkcode}" />
		</c:url>
				<tr>
					<td><c:url var="parkImg" value="/img/parks/${park.parkcode}" />
						<a href="${parkHref}"><img
							src="img/parks/${park.parkcode.toLowerCase()}.jpg" /></a></td>
					<td>${park.parkname}</td>
					<td>${park.state}</td>
					<td>${park.parkdescription} <a href="${parkHref}">Click here for more info.</a></td>
				</tr>
			</c:forEach>




		</table>
		<%-- <a href="notificationSignupInput"><img alt="I Want Awesome Button" src="img/button.png"></a> --%>
	</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
