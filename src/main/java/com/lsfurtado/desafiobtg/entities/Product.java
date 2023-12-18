package com.lsfurtado.desafiobtg.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Table(name = "produto")
@Entity
public class Product {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value = "id")
	private Integer id;
	@JsonProperty(value = "produto")
	private String product;

	@JsonProperty(value = "quantidade")
	private int quantity;

	@JsonProperty(value = "preco")
	private Double price;

	@JsonProperty(value = "valor total")
	private Double total;

	public Product() {

	}

	public Product(String product, int quantity, Double price, Double total) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
