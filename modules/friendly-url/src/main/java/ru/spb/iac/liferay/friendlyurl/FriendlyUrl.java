package ru.spb.iac.liferay.friendlyurl;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import org.osgi.service.component.annotations.Component;
import ru.spb.iac.liferay.friendlyurl.constants.ExamplePortletKeys;

@Component(
        property = {
                "com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/routes.xml",
                "javax.portlet.name=" + ExamplePortletKeys.EXAMPLE,
        },
        service = FriendlyURLMapper.class
)
public class FriendlyUrl extends DefaultFriendlyURLMapper {
    private static final String _MAPPING = "archives";

    @Override
    public String getMapping() {
        return _MAPPING;
    }
}
