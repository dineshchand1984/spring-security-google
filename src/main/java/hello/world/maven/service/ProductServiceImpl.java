package hello.world.maven.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.world.maven.entity.Product;
import hello.world.maven.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
 
	@Autowired
	ProductRepository productRepository;
 
    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
 
    @Override
    public Product getProduct(long id) {
        return productRepository
          .findById(id);
    }
 
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}