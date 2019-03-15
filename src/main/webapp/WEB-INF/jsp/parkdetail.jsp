<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
	prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="common/header.jsp"%>
	<div id="main_content">
		<h2 class="title">

				<c:out value="${park.parkname}" />
				<c:out value="${park.state}" />
			
		</h2>
		<div id="img">
			<c:url var="parkImg"
				value="/img/parks/${park.parkcode.toLowerCase()}.jpg" />
			<img src="${parkImg}" />
		</div>
		<div id="parkInfo">

		<div>

			<c:url var="forecastHref" value="/fivedayforecast">
				<c:param name="parkcode" value="${park.parkcode}" />
			</c:url>
			<a id="fiveDayforecastbutton" href="${forecastHref}">See 5 Day Forecast</a>
			<p>Acreage: <c:out value="${park.acreage}"/></p>
			<p>Elevation in Feet: <c:out value="${park.elevationinfeet}"/></p>
			<p>Miles of Trail: <c:out value="${park.milesoftrail}"/></p>
			<p>Number of Campsites: <c:out value="${park.numberofcampsites}"/></p>
			<p>Climate: <c:out value="${park.climate}"/><p>
			<p>Year Founded: <c:out value="${park.yearfounded}"/></p>
			<p>Annual Visitor Count: <c:out value="${park.annualvisitorcount}"/></p>
			<p>Inspirational Quote: <c:out value="${park.inspirationalquote}"/> -<c:out value="${park.inspirationalquotesource}"/></p>
			<p>Park Description: <c:out value="${park.parkdescription}"/></p>
			<p>Entry Fee: $<c:out value="${park.entryfee}"/></p>
			<p>Number of Animal Species: <c:out value="${park.numberofanimalspecies}"/></p>	
		</div>
	
		<div></div>
	</div>
	</div>
</body>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />