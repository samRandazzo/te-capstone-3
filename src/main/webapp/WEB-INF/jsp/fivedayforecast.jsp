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

	<form action="${tempHref}" method="GET">
		<input type="hidden" name="fivedayforecastvalue" value="${fivedayforecastvalue}" /> 
		<input type="hidden" name="parkcode" value="${park.parkcode}" /> 
		<span> 
			<input id="fahrenheit" type="submit" name="tempUnit" value="fahrenheit" />
			<input id="celsius" type="submit" name="tempUnit" value="celsius" />

		</span>


	</form>

	<c:forEach items="${fivedayforecast}" var="dailyForecast">

		<table id="tableWeather">
			<tr id="tileWeather">
				<td class="weatherImg"><c:url var="weatherImage"
						value="/img/weather/${dailyForecast.parsedForecast}.png" /> <img
					src="${weatherImage}" /> <c:choose>
						<c:when test="${celsius == true}">
							<td class="tileData">High: <c:out
									value="${(dailyForecast.high - 32) / 1.8}" /> C
							</td>

							<td class="tileData">Low: <c:out
									value="${(dailyForecast.low - 32) / 1.8}" /> C
							</td>

						</c:when>
						<c:otherwise>
							<td class="tileData">High: <c:out
									value="${dailyForecast.high}" /> F
							</td>

							<td class="tileData">Low: <c:out
									value="${dailyForecast.low}" /> F
							</td>
						</c:otherwise>

					</c:choose>
											<td class="tileData"><c:out value="${dailyForecast.weatherMessage}" /></td>
					
			</tr>

		</table>


	</c:forEach>
	<c:import url="/WEB-INF/jsp/common/footer.jsp" />