<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="common/header.jsp"%>

<table class="topParksTable">
		<h1>Top 25 Favorite Parks</h1>
	<c:forEach items="${topParks}" var="park">

		<tr> 
			<td class="congratsImage"> 
				<c:url var="imageLink" value="/img/parks/${park.key.toLowerCase() }.jpg" />
				<img src="${imageLink }" class="congratsImage"/>
			</td>
			<td>
				<c:out value="${parkList[park.key].parkname}"/>
			</td>
			<td>
				<c:out value="${park.value }" />
			</td>
		</tr>	

	</c:forEach>
</table>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />

