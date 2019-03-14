<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@include file="common/header.jsp"%>
<head><title>Forecast BullShiiiit.</title></head>
<body>
<div><h1>Five Day Weather Forecast</h1></div>
	<table border="1">
		<c:forEach var="forecasts" items="${forcast}">
		<tr>
		<td>${weather.fivedayforecastvalue}</td>
		<td>${weather.low}</td>
		<td>${weather.high}</td>
		<td>${weather.forecast}</td>
		</tr>
		</c:forEach>
	</table>

</body>
<%@include file="common/header.jsp"%>