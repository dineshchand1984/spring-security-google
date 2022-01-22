package hello.world.maven.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.world.maven.entity.Product;
import hello.world.maven.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
 
	@Autowired
	ProductService productService;
 
    @GetMapping("/all")
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
    
    @GetMapping("/details/{id}")
    public @NotNull Product getProductDetails( @PathVariable(value = "id") long id){
    	return productService.getProduct(id);
    }
}
