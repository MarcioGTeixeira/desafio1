package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double discountValue = order.getBasic() * (order.getDiscount() /100.0);
        double discountPrice = order.getBasic() - discountValue;
        double ShippingCoast = shippingService.shipment(order);
        return discountPrice + ShippingCoast;
    }
}
