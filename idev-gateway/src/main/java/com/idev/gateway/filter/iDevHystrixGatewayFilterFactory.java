package com.idev.gateway.filter;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.gateway.filter.factory.HystrixGatewayFilterFactory;
import org.springframework.web.reactive.DispatcherHandler;

public class iDevHystrixGatewayFilterFactory extends HystrixGatewayFilterFactory {

    public iDevHystrixGatewayFilterFactory(ObjectProvider<DispatcherHandler> dispatcherHandler) {
        super(dispatcherHandler);
    }
}
