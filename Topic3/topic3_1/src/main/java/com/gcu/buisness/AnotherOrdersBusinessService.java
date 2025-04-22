package com.gcu.buisness;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

    @Override
    public void test() {
        System.out.println("Hello from the AnotherOrdersBuisnessServivce");
    }

    @Override
    public List<OrderModel> getOrders() {
        List<OrderModel> orders = new ArrayList<OrderModel>();
        orders.add(new OrderModel(0L, "0000000001", "AnotherOrdersBuisnessServivce Product 1", 1.0f, 1));
        orders.add(new OrderModel(1L, "0000000002", "AnotherOrdersBuisnessServivce Product 2", 2.0f, 2));
        orders.add(new OrderModel(2L, "0000000003", "AnotherOrdersBuisnessServivce Product 3", 3.0f, 3));
        orders.add(new OrderModel(3L, "0000000004", "AnotherOrdersBuisnessServivce Product 4", 4.0f, 4));
        orders.add(new OrderModel(4L, "0000000005", "AnotherOrdersBuisnessServivce Product 5", 5.0f, 5));

        return orders;
    }
    
}
