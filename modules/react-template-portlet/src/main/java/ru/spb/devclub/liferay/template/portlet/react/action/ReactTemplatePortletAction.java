package ru.spb.devclub.liferay.template.portlet.react.action;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import ru.spb.devclub.liferay.template.portlet.react.constants.ReactTemplatePortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ReactTemplatePortletKeys.PortletName
        },
        service = ConfigurationAction.class
)
public class ReactTemplatePortletAction extends DefaultConfigurationAction {
    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String sizeProperty = "size";
        String size = ParamUtil.getString(actionRequest, sizeProperty, "300");
        setPreference(actionRequest, sizeProperty, size);

        String typeProperty = "typeId";
        String typeId = ParamUtil.getString(actionRequest, typeProperty);
        setPreference(actionRequest, typeProperty, typeId);

        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    @Override
    public void include(PortletConfig portletConfig, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<Map.Entry<String, String>> types = List.of(
                Map.entry("1", "Simple"),
                Map.entry("2", "Stylish"));
        httpServletRequest.setAttribute("types", types);

        super.include(portletConfig, httpServletRequest, httpServletResponse);
    }
}
