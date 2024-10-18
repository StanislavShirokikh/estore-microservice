package ru.isands.test.estore.dao.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 100)
	private String lastName;
	@Column(nullable = false, length = 100)
	private String firstName;
	@Column(length = 100)
	private String patronymic;
	@Column(nullable = false)
	private LocalDate birthDate;
	@ManyToOne
	@JoinColumn(name = "position_id")
	private PositionType position;
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;
	@ManyToMany
	@JoinTable(name = "electro_employee",
			joinColumns = @JoinColumn(name = "employee_id"),
			inverseJoinColumns = @JoinColumn(name = "electrotype_id"))
	private List<ElectroType>  electroTypes;
	@Column(nullable = false)
	private Boolean gender;
}