<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>National Park Geek</title>
<c:url value="/css/site.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">
</head>
<body>
	<header>
		<c:url var="npgeekImage" value="/img/logo.png" />
		<img src="${npgeekImage}" class="npgeekImage" /><br>
	</header>
	<nav>
		<table>
			<tr>
				<c:url var="homeLink" value="/" />
				<td><a href="${homeLink}">Home</a></td>
				<c:url var="surveyLink" value="/survey" />
				<td><a href="${surveyLink}">Survey</a></td>
				<c:url var="favoriteParks" value="/surveyResult" />
				<td><a href="${favoriteParks}">Favorite Parks</a></td>
			</tr>
		</table>
	</nav>