<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<title>National Parks Survey Results</title>
<%-- <link rel="stylesheet" href="css/site.css"></link> --%>
</head>
<body>
	<div id="main_content">
		<h1>National Parks Survey Results</h1>
		<ul>
			<c:forEach items="${surveyResults}" var="surveyResults">
				<li><c:out value="${surveyResults.parkcode}" /></li>
				<li><c:out value="${surveyResults.emailaddress}" /></li>
				<li><c:out value="${surveyResults.state}" /></li>
				<li><c:out value="${surveyResults.activitylevel}" /></li>				
			</c:forEach>
		</ul>
	</div>
</body>
</html>