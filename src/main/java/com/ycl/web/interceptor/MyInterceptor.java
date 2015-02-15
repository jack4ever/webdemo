package com.ycl.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {
	private Logger log = LoggerFactory.getLogger(MyInterceptor.class);
	
	/**
	 * Action之前执行
	 * 可以进行编码、安全控制等处理； 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		log.info("preHandle.....");
		return super.preHandle(request, response, handler);
	}

	/**
	 * 生成视图之前执行
	 * 有机会修改ModelAndView；
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info("postHandle.....");
		super.postHandle(request, response, handler, modelAndView);
	}

	/**
	 * 最后执行，可用于释放资源
	 * 可以根据ex是否为null判断是否发生了异常，进行日志记录。
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info("afterCompletion.....");
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		log.info("afterConcurrentHandlingStarted.....");
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

	
}
