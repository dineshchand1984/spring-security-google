package hello.world.maven.service;

import hello.world.maven.entity.Order;

public interface OrderService {

    public Iterable<Order> getAllOrders();
    
    public Order getOrderDetails(long id);
     
    public Order create(Order order);
 
    public void update(Order order);
}
