package com.domain.ssh.springWeb.commons;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContext implements ApplicationContextAware, DisposableBean {
    private static ApplicationContext applicationContext;

    //销毁时释放applicationContext对象
    public void destroy() throws Exception {
        applicationContext = null;
    }

    //销毁时释放applicationContext对象
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContext.applicationContext = applicationContext;
    }

    /**
     * 获取Spring容器中的对象
     * @param beanId
     * @param <T>
     * @return
     */
    public static <T> T getBean(String beanId) {
        return (T) applicationContext.getBean(beanId);
    }

}
