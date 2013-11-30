<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
	<title><fmt:message key="page.template.header.title.label" /></title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link rel="stylesheet" type="text/css" href="<spring:url value="/css/main.css"/>" />

	<script src="<spring:url value="/js/jquery-2.0.3.min.js"/>"></script>
	
	
</head>

<body>

	<div id="Wrapper">
		
		<tiles:insertAttribute name="header-body" />
		
		<tiles:insertAttribute name="container-body" />
		
		<tiles:insertAttribute name="footer-body" />
		
	</div><!-- Wrapper -->
		
</body>
</html>








