<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@include file="common/header.jsp"%>
<head><title>Forecast.</title></head>
<body>
<div><h1>Five Day Weather Forecast For <c:out value="${park.parkname}"/> </h1></div>
	<table border="1">
		<tr>
		<td><c:out value= "${theWeather.high}"/></td>
		<td><c:out value= "${theWeather.low}"/></td>
			
		</tr>
		
	</table>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />

