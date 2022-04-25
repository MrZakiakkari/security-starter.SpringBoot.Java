package io.github.mrzakiakkari;

import io.github.mrzakiakkari.meta.ViewPageNames;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController
{
	/**
	 *
	 * @param requst
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(HttpServletRequest requst, Exception exception)
	{
		ModelAndView modelAndView = new ModelAndView(ViewPageNames.ERROR_PAGE);
		modelAndView.addObject("exception", exception);
		modelAndView.addObject("url", requst.getRequestURL());
		return modelAndView;
	}
}
