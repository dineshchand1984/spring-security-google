package hello.world.maven.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderProduct {
 
    @EmbeddedId
    @JsonIgnore
    private OrderProductPK pk;
 
    @Column(nullable = false)
    private Integer quantity;
 
    // No-argument constructor
    // Needed to de-serialize/JSON output
    public OrderProduct() {}
 
    public OrderProduct(Order order, Product product, Integer quantity) {
        pk = new OrderProductPK();
        pk.setOrder(order);
        pk.setProduct(product);
        this.quantity = quantity;
    }
 
    @Transient
    public Product getProduct() {
        return this.pk.getProduct();
    }
 
    @Transient
    public Double getTotalPrice() {
        return getProduct().getPrice() * getQuantity();
    }

	private Integer getQuantity() {
		return this.quantity;
	}

	public OrderProductPK getPk() {
		return pk;
	}

	public void setPk(OrderProductPK pk) {
		this.pk = pk;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}