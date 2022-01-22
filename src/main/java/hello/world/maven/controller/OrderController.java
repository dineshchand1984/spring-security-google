package hello.world.maven.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.world.maven.entity.Order;
import hello.world.maven.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    
    @Autowired
    OrderService orderService;
    
    @GetMapping("/all")
    public @NotNull Iterable<Order> getAllOrders(){
    	return orderService.getAllOrders();
    }

    @GetMapping("/details/{id}")
    public @NotNull Order getOrderDetails(@PathVariable(value = "id") long id){
    	return orderService.getOrderDetails(id);
    }
}
