package io.github.mrzakiakkari;

import io.github.mrzakiakkari.meta.SitePaths;
import io.github.mrzakiakkari.meta.ViewPageNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import support.web.PathSupport;

@Controller
public class WebsiteController
{
	@RequestMapping(SitePaths.ROOT)
	public String getHomePage()
	{
		return PathSupport.redirect(SitePaths.TEST);
	}
	@RequestMapping(SitePaths.TEST)
	public String getTestPage()
	{
		return ViewPageNames.TEST;
	}
}
