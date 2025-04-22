package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gcu.buisness.OrdersBusinessService;
import com.gcu.buisness.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
    
    @Bean(name="ordersBuisnessService")
    public OrdersBusinessServiceInterface getOrdersBusiness() {
        return new OrdersBusinessService();
    }
}
