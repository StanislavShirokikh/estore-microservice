package ru.isands.test.estore.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "electro_id")
	private ElectroItem electroItem;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;
	@Column(nullable = false)
	private Date purchaseDate;
	@ManyToOne
	@JoinColumn(name = "type_id")
	private PurchaseType purchaseType;
}