package hello.world.maven.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import hello.world.maven.entity.Order;

@RestController
public class AppController {
	
	@GetMapping("/home")
	public String getAppVersion() {
		return "2020-05-V1.00";
	}
	
	@GetMapping("/userinfo")
	@ResponseBody
	public Principal user(Principal user) {
		return user;
	}
	
	/*
	@PostMapping
	public ResponseEntity<Order> create(@RequestBody OrderForm form) {
	    List<OrderProductDto> formDtos = form.getProductOrders();
	    validateProductsExistence(formDtos);
	    // create order logic
	    // populate order with products
	 
	    order.setOrderProducts(orderProducts);
	    this.orderService.update(order);
	 
	    String uri = ServletUriComponentsBuilder
	      .fromCurrentServletMapping()
	      .path("/orders/{id}")
	      .buildAndExpand(order.getId())
	      .toString();
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Location", uri);
	 
	    return new ResponseEntity<>(order, headers, HttpStatus.CREATED);
	}
	*/	
}
