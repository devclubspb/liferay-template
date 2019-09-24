package ru.spb.iac.liferay.friendlyurl.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;
import ru.spb.iac.liferay.friendlyurl.constants.ExamplePortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        property = {
                "javax.portlet.name=" + ExamplePortletKeys.EXAMPLE,
                "mvc.command.name=/"
        },
        service = MVCRenderCommand.class
)
public class Render implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        return "/view.jsp";
    }
}
