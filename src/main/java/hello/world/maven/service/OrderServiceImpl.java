package hello.world.maven.service;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.world.maven.entity.Order;
import hello.world.maven.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
 
	@Autowired
	OrderRepository orderRepository;
 
    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }
    
    @Override
    public Order getOrderDetails(long id) {
    	return this.orderRepository.findById(id).orElseGet(null);
    }
     
    @Override
    public Order create(Order order) {
        order.setDateCreated(LocalDate.now());
        return this.orderRepository.save(order);
    }
 
    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}