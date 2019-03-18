<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="common/header.jsp"%>
<c:url value="/css/site.css" var="cssHref" />

<h1 class="homeTitle">Welcome to National Park Geek!</h1>
<div class="homeContainer">

	<table id="table">
		<c:forEach var="park" items="${parks}">
			<c:url value="/parkdetail" var="parkHref">
				<c:param name="parkcode" value="${park.parkcode}" />
			</c:url>
			<tr id="tile">
				<td class="tileData"><c:url var="parkImg"
						value="/img/parks/${park.parkcode}" /> <a href="${parkHref}"><img
						id="image" src="img/parks/${park.parkcode.toLowerCase()}.jpg" /></a></td>
				
				<td class="tileData" id="parkName">${park.parkname}</td>
				<td class="tileData" id="parkState">${park.state}</td>
				<td class="tileData" id="parkDescription">${park.parkdescription}<a
					href="${parkHref}">Click here for more info.</a></td>
		
			</tr>
		</c:forEach>
	</table>
</div>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
