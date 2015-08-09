<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>LPS3000</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
	TEST ${typeId}
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">

				<h1>Vali sihtkoht</h1>
				<form:form action="selectDestination" method="post"
					modelAttribute="destinations" class="form-horizontal">
					<div class="input-group">
						<div class="form-group">
							<label for="type_id" class="control-label col-md-3">Sihtkohad:</label>
							<%-- <form:select path="destination" id="type_id">
								<c:forEach var="location" items="${locations}" varStatus="status">
									<option value="${ratingitem.id}">${ratingitem.name}</option>
								</c:forEach>
							</form:select> --%>
							<br />
							<font color='red'><form:errors path='type_id' /></font>
						</div>
						<div class="form-group">
							<a href="<c:url value='/' />"
								class="btn btn-secondary pull-left btn-sm">&lt; Tagasi</a>
							<button type="submit" class="btn btn-primary pull-right">Mine</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
