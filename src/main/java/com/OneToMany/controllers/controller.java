package com.OneToMany.controllers;

import com.OneToMany.models.ClassCategory;
import com.OneToMany.models.ClassProduct;
import com.OneToMany.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/index")
public class controller {
    @Autowired
    private ClassService service;

    // SHOW ALL
    @GetMapping("/showAllCateg")
    public List<ClassCategory> showCate()
    {
        return service.showAllCategorys();
    }
    @GetMapping("/showAllProduc")
    public List<ClassProduct> showProd()
    {
        return service.showAllProducts();
    }


    // FIND  BY ID
    @GetMapping("/findCateg/{id}")
    public Optional<ClassCategory> findById(@PathVariable Long id){
       return service.findCategById(id);
    }
    @GetMapping("/findProduc/{id}")
    public Optional<ClassProduct> findProdById(@PathVariable Long id){
        return service.findProdById(id);
    }

    //DELETE
    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCa(@PathVariable Long id){
        service.deleCateById(id);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public void deletePro(@PathVariable Long id){
        service.deleProduById(id);
    }
}
