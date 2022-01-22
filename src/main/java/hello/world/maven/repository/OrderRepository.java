package hello.world.maven.repository;

import org.springframework.data.repository.CrudRepository;

import hello.world.maven.entity.Order;

public interface OrderRepository  extends CrudRepository<Order, Long> {
	
}
