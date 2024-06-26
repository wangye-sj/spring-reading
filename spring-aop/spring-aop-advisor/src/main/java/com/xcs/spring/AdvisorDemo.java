package com.xcs.spring;

import org.springframework.aop.framework.ProxyFactory;

/**
 * AdvisorDemo
 *
 * @author xcs
 * @date 时间
 */
public class AdvisorDemo {

    public static void main(String[] args) {
        // 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(new MyService());
        // 添加Advisor
        proxyFactory.addAdvisor(new MyCustomAdvisor());
        // 获取代理对象
        MyService proxy = (MyService) proxyFactory.getProxy();
        // 调用方法
        proxy.foo(); // 会触发通知
        proxy.bar(); // 不会触发通知
    }
}
