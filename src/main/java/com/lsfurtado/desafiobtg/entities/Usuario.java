package com.lsfurtado.desafiobtg.entities;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value = "codigoPedido")
	private Integer id;

	@JsonProperty(value = "codigoCliente")
	private Integer code;

	@OneToMany
	@JsonProperty(value = "Itens")
	private List<Product> product;

	public Usuario() {
	}

	public Usuario(Integer id, Integer code, List<Product> product) {
		this.id = id;
		this.code = code;
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

}
