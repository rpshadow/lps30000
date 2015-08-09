<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<title>Navigeeri</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
</head>
<body>TEST ${typeId}
<c:forEach var="ratingitem" items="${listCompany}" varStatus="status">
<hr></hr>
	<div class="media">
		<div class="media-body">
			<h4 class="media-heading">
				${ratingitem} <small>${ratingitem}/10</small>
			</h4>
			${ratingitem}
			<div class="media"></div>
		</div>
	</div>
</c:forEach>

</body>
</html>
