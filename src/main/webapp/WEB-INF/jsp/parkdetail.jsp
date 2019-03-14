; [;iu hj6trrrfedszyt<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
	prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@include file="common/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>National Parks Details</title>
<%-- <link rel="stylesheet" href="css/site.css"></link> --%>
</head>
<body>

	<div id="main_content">
		<h2>
			<p>
				<c:out value="${park.parkname}" />
				<c:out value="${park.state}" />
			</p>
		</h2>
		<div id="img">
			<c:url var="parkImg"
				value="/img/parks/${park.parkcode.toLowerCase()}.jpg" />
			<img src="${parkImg}" />
		</div>

		<div id="parkInfo">
			<p>
				Acreage:
				<c:out value="${park.acreage}" />
			</p>
			<p>
				Elevation in Feet:
				<c:out value="${park.elevationinfeet}" />
			</p>
			<p>
				Miles of Trail:
				<c:out value="${park.milesoftrail}" />
			</p>
			<p>
				Number of Campsites:
				<c:out value="${park.numberofcampsites}" />
			</p>
			<p>
				Climate:
				<c:out value="${park.climate}" />
			<p>
			<p>
				Year Founded:
				<c:out value="${park.yearfounded}" />
			</p>
			<p>
				Annual Visitor Count:
				<c:out value="${park.annualvisitorcount}" />
			</p>
			<p>
				Inspirational Quote:
				<c:out value="${park.inspirationalquote}" />
				-
				<c:out value="${park.inspirationalquotesource}" />
			</p>
			<p>
				Park Description:
				<c:out value="${park.parkdescription}" />
			</p>
			<p>
				Entry Fee: $
				<c:out value="${park.entryfee}" />
			</p>
			<p>
				Number of Animal Species:
				<c:out value="${park.numberofanimalspecies}" />
			</p>

		</div>
		<div>

			<c:url var="forecastHref" value="/fivedayforecast">
				<c:param name="parkcode" value="${park.parkcode}" />
			</c:url>
			<a id="fiveDayforecastbutton" href="${forecastHref}">See 5 Day Forecast</a>
		</div>
		<div></div>


		<%-- <a href="notificationSignupInput"><img alt="I Want Awesome Button" src="img/button.png"></a> --%>
	</div>
</body>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />

</html>