<%@ include file="/init.jsp" %>

<div id="<portlet:namespace />-root"></div>

<aui:script require="${mainRequire}">
    main.default('<portlet:namespace />-root', {
    	title: '${portletDisplay.title}',
    	locale: '${themeDisplay.locale}',
        size: '${size}',
        typeId: '${typeId}'
    });
</aui:script>