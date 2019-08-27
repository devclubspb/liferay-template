<%@ include file="/META-INF/resources/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.util.Constants" %>

<liferay-portlet:actionURL portletConfiguration="<%= true %>"
                           var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%= true %>"
                           var="configurationRenderURL" />

<aui:form action="${configurationActionURL}" method="post" name="fm">

    <aui:input name="<%= Constants.CMD %>" type="hidden"
               value="<%= Constants.UPDATE %>" />

    <aui:input name="redirect" type="hidden"
               value="${configurationRenderURL}" />
    <div class="container-fluid-1280 feed-config">
        <div class="card-horizontal main-content-card">
            <div class="panel-group feed-config">
                <aui:input name="size" label="size" title="size" value="${size}" />
                <aui:select name="typeId" label="type" title="type">
                    <%--@elvariable id="rubrics" type="java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>>"--%>
                    <c:forEach items="${types}" var="type">
                        <aui:option value="${type.key}" label="${type.value}" selected="${typeId eq type.key}" />
                    </c:forEach>
                </aui:select>

                <aui:button type="submit" cssClass="btn btn-lg btn-primary btn-default" />
            </div>
        </div>
    </div>
</aui:form>