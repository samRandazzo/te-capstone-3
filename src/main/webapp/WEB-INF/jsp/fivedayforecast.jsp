<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@include file="common/header.jsp"%>
<head>
<title>Forecast.</title>
</head>
<body>
	<div>
		<h1>
			Five Day Weather Forecast For
			<c:out value="${park.parkname}" />
		</h1>
	</div>



	<c:url value="/temperature" var="tempHref" />
<<<<<<< HEAD
	<form action="${tempHref}">
		<input type="hidden" name="fivedayforecastvalue"
			value="${fivedayforecastvalue}" /> <input type="hidden"
			name="parkcode" value="${park.parkcode}" /> <span> <input
			id="fahrenheit" type="submit" name="tempUnit" value="Fahrenheit" />
			<input id="celsius" type="submit" name="tempUnit" value="Celsius" />

		</span>
=======
	<form action="${tempHref}" />
	<input type="hidden" name="fivedayforecastvalue"
		value="${fivedayforecastvalue}" />
	<input type="hidden" name="parkcode" value="${park.parkcode}" />
	<span> <input id="fahrenheit" type="submit" name="tempUnit"
		value="Fahrenheit" /> <input id="celsius" type="submit"
		name="tempUnit" value="Celsius" />

	</span>
>>>>>>> eced1a56ca39b13b8652950cf61481a85d7393eb
	</form>

	<c:forEach items="${fivedayforecast}" var="dailyForecast">

		<table border="1">
			<tr>
				<td><c:url var="weatherImage"
						value="/img/weather/${dailyForecast.parsedForecast}.png" /> <img
<<<<<<< HEAD
					src="${weatherImage}" />
				<td><c:out value="${dailyForecast.high}" /></td>
				<td><c:out value="${dailyForecast.low}" /></td>

			</tr>

=======
					src="${weatherImage}" /> 
						<c:choose>
						<c:when test="${celsius == true}">
							<td><c:out value="${(dailyForecast.high - 32) / 1.8}" /></td>
							
							<td><c:out value="${(dailyForecast.low - 32) / 1.8}" /></td>
							
							</c:when>
							<c:otherwise>
							<td><c:out value="${dailyForecast.high}" /></td>
							
							<td><c:out value="${dailyForecast.low}" /></td>
							</c:otherwise>
			
			</c:choose>
			</tr>
>>>>>>> eced1a56ca39b13b8652950cf61481a85d7393eb
		</table>


	</c:forEach>
	<c:import url="/WEB-INF/jsp/common/footer.jsp" />