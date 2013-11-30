<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<!-- Jsp that contains div with locales -->

<div id="languages">
	<fmt:message key="com.rocky.jenosystem.language" />: 
	<a href="?language=en"><fmt:message key="com.rocky.jenosystem.language.english" /></a>|
	<a href="?language=gr"><fmt:message key="com.rocky.jenosystem.language.greek" /></a>
</div>