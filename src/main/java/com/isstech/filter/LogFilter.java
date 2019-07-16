package com.isstech.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @ClassName LogFilter
 * @Description 日志Filter
 * @Author issuser
 * @Date 2019/7/16 17:59
 * @Version 1.0.0
 */
@Component
public class LogFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 4;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext =  RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        logger.info("URL : {}", request.getRequestURI());
        return null;
    }
}
