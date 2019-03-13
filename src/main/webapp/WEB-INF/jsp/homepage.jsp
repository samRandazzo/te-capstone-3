<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
			<tr>
				<td>${park.parkname}</td>
				<td>${park.state}</td>
				<td>${park.parkdescription}</td>

			</tr>
		</c:forEach>
			
			
			
			
			</table>
			<%-- <a href="notificationSignupInput"><img alt="I Want Awesome Button" src="img/button.png"></a> --%>
		</div>
	</body>
</html>