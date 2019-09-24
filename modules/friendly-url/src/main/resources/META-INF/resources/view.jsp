<%@ include file="/init.jsp" %>

<liferay-portlet:renderURL var="archiveUrl">
    <liferay-portlet:param name="archiveAbbr" value="cga"/>
    <liferay-portlet:param name="mvcRenderCommandName" value="/getArchive"/>
</liferay-portlet:renderURL> 

<p>
	<b><liferay-ui:message key="example.caption"/></b>
    <a href="${archiveUrl}">CGA</a>
</p>