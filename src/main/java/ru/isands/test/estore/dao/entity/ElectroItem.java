package ru.isands.test.estore.dao.entity;

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

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class ElectroItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String name;
    @ManyToOne
    @JoinColumn(name = "e_type_id")
    private ElectroType electroType;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
    @Column(nullable = false)
    private Integer count;
    @Column(nullable = false)
    private Boolean archived;
    @Column(length = 255)
    private String description;
    @ManyToMany
    @JoinTable(name = "electro_shop",
            joinColumns = @JoinColumn(name = "electro_item_id"),
            inverseJoinColumns = @JoinColumn(name = "shop_id"))
    private List<Shop> shops;
}
