<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<div id="headerwrap">

	<div id="header">
		
		<jsp:include page="language.jsp" />

		<div>
			<img id="logoId" src="<spring:url value="/img/logo.png" />">
		</div>

		<h1>Hello world!</h1>


	</div>
</div>