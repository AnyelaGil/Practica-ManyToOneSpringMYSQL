package com.OneToMany.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class ClassCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonIgnoreProperties("category")
    private List<ClassProduct> listProducts = new ArrayList<>();

    public List<ClassProduct> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<ClassProduct> listProducts) {
        this.listProducts = listProducts;
    }
}
