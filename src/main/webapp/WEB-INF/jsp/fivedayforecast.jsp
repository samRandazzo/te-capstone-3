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
		<form action="${tempHref}">
			<input type="hidden" name="fivedayforecastvalue"
				value="${fivedayforecastvalue}" /> <input type="hidden"
				name="parkcode" value="${park.parkcode}" /> <span> <input
				id="fahrenheit" type="submit" name="tempUnit" value="Fahrenheit" />
				<input id="celsius" type="submit" name="tempUnit" value="Celsius" />

			</span>
		</form>

		<c:forEach items="${fivedayforecast}" var="dailyForecast">

			<table border="1">
				<tr>
					<td><c:url var="weatherImage"
							value="/img/weather/${dailyForecast.parsedForecast}.png" /> <img
						src="${weatherImage}" />
					<td><c:out value="${dailyForecast.high}" /></td>
					<td><c:out value="${dailyForecast.low}" /></td>

				</tr>

			</table>


	</c:forEach>
		<c:import url="/WEB-INF/jsp/common/footer.jsp" />