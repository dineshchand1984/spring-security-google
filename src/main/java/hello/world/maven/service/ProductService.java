package hello.world.maven.service;

import hello.world.maven.entity.Product;

public interface ProductService {

    public Iterable<Product> getAllProducts();
 
    public Product getProduct(long id);
 
    public Product save(Product product);
}
