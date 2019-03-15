<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@include file="common/header.jsp"%>
<head><title>Forecast.</title></head>
<body>
<div><h1>Five Day Weather Forecast For <c:out value="${park.parkname}"/> </h1></div>
<c:forEach items="${fivedayforecast}" var="dailyForecast">
	
	<table border="1">
		<tr>
<<<<<<< HEAD
		<td><c:out value= "${theWeather.high}"/></td>
		<td><c:out value= "${theWeather.low}"/></td>
			
=======
		<td><c:out value= "${dailyForecast.high}"/></td>
		<td><c:out value= "${dailyForecast.low}"/></td>	
>>>>>>> 42aa2dce4acb4fd51daba9f44ddc65235afb8f9e
		</tr>
		
	</table>
	
</c:forEach>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />

