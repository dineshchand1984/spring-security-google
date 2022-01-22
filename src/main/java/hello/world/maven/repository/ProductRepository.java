package hello.world.maven.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import hello.world.maven.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findByName(String name);
	
	Optional<Product> findById(Long id);
}
