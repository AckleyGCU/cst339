package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.buisness.OrdersBusinessService;
import com.gcu.buisness.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
    
    @Bean(name="ordersBuisnessService", initMethod="init", destroyMethod="destroy")
    @SessionScope
    public OrdersBusinessServiceInterface getOrdersBusiness() {
        return new OrdersBusinessService();
    }
}
